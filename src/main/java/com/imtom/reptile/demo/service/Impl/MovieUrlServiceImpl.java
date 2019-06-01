package com.imtom.reptile.demo.service.Impl;

import com.imtom.reptile.demo.mapper.MovieUrlDao;
import com.imtom.reptile.demo.entity.MovieUrlEntity;
import com.imtom.reptile.demo.service.MovieUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MovieUrlServiceImpl
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/28 20:36
 * @Version 1.0
 **/
@Service(value = "MovieUrlService")
public class MovieUrlServiceImpl implements MovieUrlService {

    //@Resource(name = "movieUrlDao")
    @Autowired
    private MovieUrlDao movieUrlDao;


    @Override
    public MovieUrlEntity queryObject(String id) {
        return movieUrlDao.queryObject(id);
    }

    @Override
    public void save(MovieUrlEntity movieUrlEntity) {
        System.out.println("进入serviceImpl方法");
         movieUrlDao.save(movieUrlEntity);
    }


}
