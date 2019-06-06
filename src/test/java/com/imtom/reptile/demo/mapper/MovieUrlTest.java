package com.imtom.reptile.demo.mapper;

import com.imtom.reptile.demo.entity.MovieUrlEntity;
import com.imtom.reptile.demo.utils.UUidTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.IOException;

import static com.imtom.reptile.demo.utils.GetMovieDesc.getListDesc;

/**
 * @ClassName MovieUrlTest
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/31 14:28
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieUrlTest {

    @Autowired
    private  MovieUrlDao movieUrlDao;


    @Test
    public void contextLoads() {
        System.out.println("hello world1");
        //MovieUrlService movieUrlService=new MovieUrlServiceImpl();
        MovieUrlEntity movieUrlEntity=new MovieUrlEntity();
        movieUrlEntity.setId(UUidTools.getuuid());
        movieUrlEntity.setDesUrl("123");
        movieUrlEntity.setDesId("123");
        MovieUrlEntity movieUrlEntity1 = movieUrlDao.queryObject("123");
        System.out.println("fanhui"+movieUrlEntity1.toString());
        //  movieUrlDao.save(movieUrlEntity);
        System.out.println("hello world2");
    }

    @Test
    public  void insertdb() throws IOException {
        String url="https://www.dy2018.com/html/gndy/dyzz/";
         getListDesc(url);
    }
}
