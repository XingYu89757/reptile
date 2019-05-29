package com.imton.reptile.demo.service;

import com.imton.reptile.demo.dao.MovieUrlDao;
import com.imton.reptile.demo.entity.MovieUrlEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieUrlService {
    MovieUrlEntity queryObject(String id);

    List<MovieUrlEntity> queryList();

    int save(MovieUrlEntity movieUrlEntity);

    MovieUrlDao update(MovieUrlEntity movieUrlEntity);

    int delete(int id);

    int deleteBatch(List list);
}
