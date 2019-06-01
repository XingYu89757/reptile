package com.imtom.reptile.demo.mapper;

import com.imtom.reptile.demo.entity.MovieTypeEntity;
import com.imtom.reptile.demo.entity.MovieUrlEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository(value = "movieUrlDao")
@Mapper
public interface MovieUrlDao {
    MovieUrlEntity queryObject(@Param("id") String id);

    void save(MovieUrlEntity movieUrlEntity);



}
