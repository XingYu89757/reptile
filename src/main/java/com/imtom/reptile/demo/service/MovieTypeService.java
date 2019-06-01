package com.imtom.reptile.demo.service;

import com.imtom.reptile.demo.entity.MovieTypeEntity;

import java.util.List;

public interface MovieTypeService {
    MovieTypeEntity queryObject(String id);

    List<MovieTypeEntity> queryList();

    int save(MovieTypeEntity movieTypeEntity);

    MovieTypeEntity update(MovieTypeEntity movieTypeEntity);

    int delete(int id);

    int deleteBatch(List list);

}
