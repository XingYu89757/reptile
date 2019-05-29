package com.imton.reptile.demo.service;

import com.imton.reptile.demo.dao.MovieTypeDao;
import com.imton.reptile.demo.entity.MovieTypeEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieTypeService {
    MovieTypeEntity queryObject(String id);

    List<MovieTypeEntity> queryList();

    int save(MovieTypeEntity movieTypeEntity);

    MovieTypeEntity update(MovieTypeEntity movieTypeEntity);

    int delete(int id);

    int deleteBatch(List list);
}
