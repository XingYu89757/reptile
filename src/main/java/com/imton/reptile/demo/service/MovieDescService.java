package com.imton.reptile.demo.service;

import com.imton.reptile.demo.entity.MovieDescEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieDescService {
    MovieDescEntity queryObject(String id);

    List<MovieDescEntity> queryList();

    int save(MovieDescEntity movieDescEntity);

    MovieDescEntity update(MovieDescEntity movieDescEntity);

    int delete(int id);

    int deleteBatch(List list);
}
