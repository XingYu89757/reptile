package com.imtom.reptile.demo.service;

import com.imtom.reptile.demo.entity.MovieDescEntity;

import java.util.List;

public interface MovieDescService {
    MovieDescEntity queryObject(String id);

    List<MovieDescEntity> queryList();

    int save(MovieDescEntity movieDescEntity);

    MovieDescEntity update(MovieDescEntity movieDescEntity);

    int delete(int id);

    int deleteBatch(List list);

}
