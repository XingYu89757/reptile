package com.imton.reptile.demo.utils;

import com.imton.reptile.demo.entity.MovieDescEntity;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @ClassName getMovieDesc
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/22 14:34
 * @Version 1.0
 **/
public class GetMovieDesc {

    private static Logger LOG= LoggerFactory.getLogger(GetMovieDesc.class);
    static int i=0;
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
            String text = items.text();//获取到名称
            //如果小于20进行详情查询
            if (i<=1){
                LOG.info("当前为第"+i+"条数据");
                getDes(attr);//进入详情页面
            }else{//如果大于25将i设置为0，跳转下一页
                i=0;
              //  getListDesc(attr);
            }

           // System.out.println(text);
           // System.out.println(attr);

        }
        System.out.println(i);

    }

    public static void getDes(String url) throws IOException {
        MovieDescEntity movieDescEntity=new MovieDescEntity();//创建电影详情的对象
        movieDescEntity.setId(UUidTools.getuuid());
        Document documentDesc = Jsoup.connect(url).get();
        Element co_area2 = documentDesc.getElementsByClass("co_area2").first();
        String title_all = co_area2.getElementsByClass("title_all").text();//得到title
        Elements select1 = co_area2.select("img[src]");//获取图片路径
        for (Element src : select1){
                System.out.println(src.attr("abs:src"));//获取图片的路径,共两个第一个为海报，第二个为电影截图
        }
        Elements p = co_area2.select("p");
        MovieDescEntity info = InfoUtils.getInfo(p, movieDescEntity);
        //获取下载的链接
        Element tbody = co_area2.select("tbody").first();
        Element downUrl = tbody.select("a[href]").first();
        String attr = downUrl.attr("abs:href");
        System.out.println("获取的下载的地址"+attr);

    }
    public static void main(String[] args) throws IOException {
        String url="https://www.dy2018.com/html/gndy/dyzz/";
        getListDesc(url);
    }
}
