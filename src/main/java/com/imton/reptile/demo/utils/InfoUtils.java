package com.imton.reptile.demo.utils;

import com.imton.reptile.demo.entity.MovieDescEntity;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName InfoUtils
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/23 10:10
 * @Version 1.0
 **/
public class InfoUtils {
    private static Logger LOG= LoggerFactory.getLogger(InfoUtils.class);
    /**
     * @Author Mr.Xing
     * @Description //解析html的内容，通过将内容分开
     * @Date 10:11 2019/5/23
     * @Param [info]
     * @return java.lang.String
     **/

    public static MovieDescEntity getInfo( Elements elements, MovieDescEntity movieDescEntity){

        for (int i=1;i<elements.size();i++) {
            String info = elements.get(i).text();//获取p标签中所有的内容

            String infos = info.replaceAll("　", "");//截取第一个符号，取出空格
            if (infos.length() != 0 && infos != "") {
                if (infos.contains("译名")) {
                    movieDescEntity.setTranslatedName(infos.substring(3));
                } else if (infos.contains("片名")) {
                    movieDescEntity.setOldName(infos.substring(3));
                } else if (infos.contains("年代")) {
                    movieDescEntity.setYear(infos.substring(3));
                } else if (infos.contains("产地")) {
                    movieDescEntity.setPlaceOrigin(infos.substring(3));
                } else if (infos.contains("类别")) {
                    movieDescEntity.setType(infos.substring(3));
                } else if (infos.contains("语言")) {
                    movieDescEntity.setLanguage(infos.substring(3));
                } else if (infos.contains("字幕")) {
                    movieDescEntity.setSubitile(infos.substring(3));
                } else if (infos.contains("上映日期")) {
                    movieDescEntity.setReleaseTime(infos.substring(5));
                } else if (infos.contains("豆瓣评分")) {
                    movieDescEntity.setDouban(infos.substring(5));
                } else if (infos.contains("IMDb评分")) {
                    movieDescEntity.setImDb(infos.substring(7));
                } else if (infos.contains(("视频尺寸"))) {
                    movieDescEntity.setVideoSize(infos.substring(5));
                } else if (infos.contains("文件大小")) {
                    movieDescEntity.setVideoMemory(infos.substring(5));
                } else if (infos.contains("片长")) {
                    movieDescEntity.setMins(infos.substring(3));
                } else if (infos.contains("导演")) {
                    movieDescEntity.setDirector(infos.substring(3));
                } else if (infos.contains("主演")) {
                    movieDescEntity.setSuperstar(infos.substring(3));
                } else if (infos.contains("简介")) {
                    String intro = elements.get(i + 1).text().trim();//简介信息获取下一个p标签中的内容
                    movieDescEntity.setIntro(intro);
                }
            }
        }
        LOG.info("通过遍历获取到的电影详情的信息"+movieDescEntity.toString());
        return movieDescEntity;
    }


}
