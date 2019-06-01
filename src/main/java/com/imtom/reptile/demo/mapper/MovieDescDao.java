package com.imtom.reptile.demo.mapper;

import com.imtom.reptile.demo.entity.MovieDescEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface MovieDescDao {

    MovieDescEntity queryObject(String id);

    List<MovieDescEntity> queryList();

    int save(MovieDescEntity movieDescEntity);

    MovieDescEntity update(MovieDescEntity movieDescEntity);

    int delete(int id);


}
