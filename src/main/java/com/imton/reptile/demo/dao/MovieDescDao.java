package com.imton.reptile.demo.dao;

import com.imton.reptile.demo.entity.MovieDescEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MovieDescDao {

    MovieDescEntity queryObject(String id);

    List<MovieDescEntity> queryList();

    int save(MovieDescEntity movieDescEntity);

    MovieDescEntity update(MovieDescEntity movieDescEntity);

    int delete(int id);

    int deleteBatch(List list);

}
