package com.imton.reptile.demo.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @ClassName GetMovieList
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/22 14:34
 * @Version 1.0
 **/
public class GetMovieList {

    /**
     * @Author Mr.Xing
     * @Description //抓取电影天堂电影标题类别信息
     * @Date 14:47 2019/5/22
     * @Param [url]
     * @return void
     **/
    public static void getList(String url) throws IOException {
        System.out.println("开始连接");
        Document document = Jsoup.connect(url).get();

       Element menu = document.getElementById("menu");

        Element element = menu.getElementsByClass("contain").get(0);
        Elements ulTag = element.getElementsByTag("li");


        for (Element items : ulTag){
            String name = items.getElementsByTag("a").text();
            System.out.println("电影类别名称"+name);
        }

        System.out.println("连接结束");

    }

    /**
     * @Author Mr.Xing
     * @Description //TODO 查询电影类别
     * @Date 15:55 2019/5/22
     * @Param [url]
     * @return void
     **/

    public static void getList2(String url) throws IOException {
        System.out.println("开始连接");
        Document document = Jsoup.connect(url).get();
        Element co_content2 = document.getElementsByClass("co_content2").first();
        Elements td = co_content2.getElementsByTag("td");

        for (Element items : td){
            String a = items.getElementsByTag("a").html().trim();
            if (a != null && a.length() !=0){
                System.out.println(a);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        String url="https://www.dy2018.com/html/gndy/dyzz/";
        getList2(url);
        System.out.println(UUidTools.getuuid());
    }
}
