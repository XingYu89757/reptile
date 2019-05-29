package com.imton.reptile.demo.service.Impl;

import com.imton.reptile.demo.dao.MovieUrlDao;
import com.imton.reptile.demo.entity.MovieUrlEntity;
import com.imton.reptile.demo.service.MovieUrlService;
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
@Service
public class MovieUrlServiceImpl implements MovieUrlService {
    @Resource
    MovieUrlDao movieUrlDao;


    @Override
    public MovieUrlEntity queryObject(String id) {
        return movieUrlDao.queryObject(id);
    }

    @Override
    public List<MovieUrlEntity> queryList() {
        return movieUrlDao.queryList();
    }

    @Override
    public int save(MovieUrlEntity movieUrlEntity) {
        return movieUrlDao.save(movieUrlEntity);
    }

    @Override
    public MovieUrlDao update(MovieUrlEntity movieUrlEntity) {
        return movieUrlDao.update(movieUrlEntity);
    }

    @Override
    public int delete(int id) {
        return movieUrlDao.delete(id);
    }

    @Override
    public int deleteBatch(List list) {
        return movieUrlDao.deleteBatch(list);
    }
}
