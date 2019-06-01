package com.imtom.reptile.demo.mapper;

import com.imtom.reptile.demo.entity.MovieTypeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository(value = "movieTypeDao")
@Mapper
public interface MovieTypeDao {
    MovieTypeEntity queryObject(String id);

    List<MovieTypeEntity> queryList();

    int save(MovieTypeEntity movieTypeEntity);

    MovieTypeEntity update(MovieTypeEntity movieTypeEntity);

    int delete(int id);

}
