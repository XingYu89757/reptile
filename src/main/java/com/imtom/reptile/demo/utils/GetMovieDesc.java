package com.imtom.reptile.demo.utils;

import com.imtom.reptile.demo.entity.MovieDescEntity;
import com.imtom.reptile.demo.entity.MovieUrlEntity;
import com.imtom.reptile.demo.service.MovieDescService;
import com.imtom.reptile.demo.service.MovieUrlService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName getMovieDesc
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/22 14:34
 * @Version 1.0
 **/
@Component
public class GetMovieDesc {

    private static Logger LOG= LoggerFactory.getLogger(GetMovieDesc.class);

    static int i=0;
    static int y=1;

    @Autowired
    private MovieUrlService mu;
    private static MovieUrlService movieUrlService;

    @Autowired
    private MovieDescService md;
    private static MovieDescService movieDescService;

    @PostConstruct
    public void init(){
        movieUrlService=this.mu;
        movieDescService=this.md;
    }



    /**
     * @Author Mr.Xing
     * @Description //获取电影信息详情
     * @Date 16:22 2019/5/22
     * @Param []
     * @return void
     **/

    public static void getListDesc(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        Element co_content8 = document.getElementsByClass("co_content8").first();
        Elements td = co_content8.getElementsByTag("td");
        Elements select = co_content8.select("a[href]");//获取到所有a标签

        for (Element items : select){
            i++;
            String attr = items.attr("abs:href");//获取到绝对路径
          //  String text = items.text();//获取到名称
            //如果小于20进行详情查询
            if (i<=25){
                LOG.info("当前为第"+i+"条数据");
                getDes(items);//进入详情页面
            }else{//如果大于25将i设置为0，跳转下一页
                i=0;
                String href =attr+"index_"+y;
                y++;
                if (y<2) {//如果页数大于304跳出递归
                    LOG.info("当前为第"+y+"页");
                    getListDesc(attr);
                }else {
                    return;
                }
            }
        }

    }

    public static void getDes(Element href) throws IOException {
        String att = href.attr("abs:href");//获取到绝对路径
        String testName = href.text();//获取到名称
        Document documentDesc = Jsoup.connect(att).get();
        Element co_area2 = documentDesc.getElementsByClass("co_area2").first();
        MovieDescEntity movieDescEntity = new MovieDescEntity();//创建电影详情的对象
        movieDescEntity.setId(UUidTools.getuuid());
        movieDescEntity.setMoveName(testName);
        //判断跳转的是否是详情页面,通过p标签的数量来进行判断
        if (co_area2.select("p").size()>10) {

            String title_all = co_area2.getElementsByClass("title_all").text();//得到title
            Elements select1 = co_area2.select("img[src]");//获取图片路径
            movieDescEntity.setImg(UUidTools.getuuid());
            //新建URl对象
            MovieUrlEntity movieUrlEntity=new MovieUrlEntity();
            movieUrlEntity.setDesId(movieDescEntity.getImg());
            for (Element src : select1) {
                movieUrlEntity.setId(UUidTools.getuuid());
                movieUrlEntity.setDesUrl(src.attr("abs:src"));
               // System.out.println(src.attr("abs:src"));//获取图片的路径,共两个第一个为海报，第二个为电影截图
            }
            Elements p = co_area2.select("p");
            MovieDescEntity info = InfoUtils.getInfo(p, movieDescEntity);
            //获取下载的链接
            Elements tbody = co_area2.select("tbody");
            //下载路径id为MovieUrl为一对多的关系
            MovieUrlEntity movieUrlEntity2 = new MovieUrlEntity();
            movieUrlEntity2.setDesId(UUidTools.getuuid());
            //如果得到的为多个路径，创建多个MovieUrl对象，将Descid设置为详情的urlid，如果得到的是一个对象创建一个对象
            if (tbody.size() > 1) {
                for (Element items : tbody) {
                    movieUrlEntity2.setId(UUidTools.getuuid());//定义movieUrl的id
                    Element item = items.select("a[href]").first();
                    String attr = item.attr("abs:href");
                    movieUrlEntity2.setDesUrl(attr);//将获取到的路径存入到对象中
                    movieUrlService.save(movieUrlEntity2);
                   LOG.info("获取的下载的对象"+movieUrlEntity2.toString());
                }
            } else {
                movieUrlEntity2.setId(UUidTools.getuuid());//定义movieUrl的id
                Element first = tbody.first().select("a[href]").first();
                String attr = first.attr("abs:href");
                movieUrlEntity2.setDesUrl(attr);//将获取的路径存入到对象中
                 movieUrlService.save(movieUrlEntity2);
               LOG.info("获取的下载的对象"+movieUrlEntity2.toString());

            }
            LOG.info(movieDescEntity.toString());
            movieDescEntity.setUrl(movieUrlEntity.getDesId());//moviceDesc中的Url对应MovieUrl中的DescUrl
                movieDescService.save(movieDescEntity);
            LOG.info("得到的对象"+movieDescEntity.toString());
        }


    }



    public static void main(String[] args) throws IOException {
        String url="https://www.dy2018.com/html/gndy/dyzz/";
        getListDesc(url);
    }
}
