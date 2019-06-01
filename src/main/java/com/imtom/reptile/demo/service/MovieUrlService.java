package com.imtom.reptile.demo.service;

import com.imtom.reptile.demo.entity.MovieTypeEntity;
import com.imtom.reptile.demo.mapper.MovieUrlDao;
import com.imtom.reptile.demo.entity.MovieUrlEntity;

import java.util.List;

public interface MovieUrlService {
    MovieUrlEntity queryObject(String id);

    void save(MovieUrlEntity movieUrlEntity);



}
