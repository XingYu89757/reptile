package com.imton.reptile.demo.service.Impl;

import com.imton.reptile.demo.dao.MovieTypeDao;
import com.imton.reptile.demo.entity.MovieTypeEntity;
import com.imton.reptile.demo.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MovieTypeServiceImpl
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/28 20:35
 * @Version 1.0
 **/
@Service
public class MovieTypeServiceImpl implements MovieTypeService {
    @Autowired
    MovieTypeDao movieTypeDao;

    @Override
    public MovieTypeEntity queryObject(String id) {
        return movieTypeDao.queryObject(id);
    }

    @Override
    public List<MovieTypeEntity> queryList() {
        return movieTypeDao.queryList();
    }

    @Override
    public int save(MovieTypeEntity movieTypeEntity) {
        return movieTypeDao.save(movieTypeEntity);
    }

    @Override
    public MovieTypeEntity update(MovieTypeEntity movieTypeEntity) {
        return movieTypeDao.update(movieTypeEntity);
    }

    @Override
    public int delete(int id) {
        return movieTypeDao.delete(id);
    }

    @Override
    public int deleteBatch(List list) {
        return movieTypeDao.deleteBatch(list);
    }
}
