package com.imton.reptile.demo.dao;

import com.imton.reptile.demo.entity.MovieDescEntity;
import com.imton.reptile.demo.entity.MovieTypeEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MovieTypeDao {
    MovieTypeEntity queryObject(String id);

    List<MovieTypeEntity> queryList();

    int save(MovieTypeEntity movieTypeEntity);

    MovieTypeEntity update(MovieTypeEntity movieTypeEntity);

    int delete(int id);

    int deleteBatch(List list);
}
