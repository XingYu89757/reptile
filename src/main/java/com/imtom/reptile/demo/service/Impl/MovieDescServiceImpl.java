package com.imtom.reptile.demo.service.Impl;

import com.imtom.reptile.demo.entity.MovieDescEntity;
import com.imtom.reptile.demo.mapper.MovieDescDao;
import com.imtom.reptile.demo.service.MovieDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MovieDescServiceImpl
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/28 20:34
 * @Version 1.0
 **/
@Service("MovieDescService")
public class MovieDescServiceImpl implements MovieDescService {

    @Autowired
   private  MovieDescDao movieDescDao;

    @Override
    public MovieDescEntity queryObject(String id) {
        return movieDescDao.queryObject(id);
    }

    @Override
    public List<MovieDescEntity> queryList() {
        return movieDescDao.queryList();
    }

    @Override
    public int save(MovieDescEntity movieDescEntity) {
        return movieDescDao.save(movieDescEntity);
    }

    @Override
    public MovieDescEntity update(MovieDescEntity movieDescEntity) {
        return movieDescDao.update(movieDescEntity);
    }

    @Override
    public int delete(int id) {
        return movieDescDao.delete(id);
    }

    @Override
    public int deleteBatch(List list) {
        return 1;
    }
}
