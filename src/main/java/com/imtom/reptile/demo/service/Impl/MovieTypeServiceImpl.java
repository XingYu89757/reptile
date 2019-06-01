package com.imtom.reptile.demo.service.Impl;

import com.imtom.reptile.demo.entity.MovieTypeEntity;
import com.imtom.reptile.demo.mapper.MovieTypeDao;
import com.imtom.reptile.demo.service.MovieTypeService;
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
@Service("MovieTypeService")
public class MovieTypeServiceImpl implements MovieTypeService {

  //  @Resource(name = "movieTypeDao")
    @Autowired
   private MovieTypeDao movieTypeDao;

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
        return 1;    }
}
