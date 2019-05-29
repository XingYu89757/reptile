package com.imton.reptile.demo.dao;

import com.imton.reptile.demo.entity.MovieUrlEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MovieUrlDao {
    MovieUrlEntity queryObject(String id);

    List<MovieUrlEntity> queryList();

    int save(MovieUrlEntity movieUrlEntity);

    MovieUrlDao update(MovieUrlEntity movieUrlEntity);

    int delete(int id);

    int deleteBatch(List list);
}
