package com.imtom.reptile.demo;

import com.imtom.reptile.demo.entity.MovieUrlEntity;
import com.imtom.reptile.demo.mapper.MovieUrlDao;
import com.imtom.reptile.demo.service.Impl.MovieUrlServiceImpl;
import com.imtom.reptile.demo.service.MovieUrlService;
import com.imtom.reptile.demo.utils.UUidTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class DemoApplicationTests {

	@Autowired
	MovieUrlService movieUrlService;

	//@Resource(name = "movieUrlDao")
	@Autowired
  	private MovieUrlDao movieUrlDao;


	@Test
	public void contextLoads() {
		System.out.println("hello world1");
		//MovieUrlService movieUrlService=new MovieUrlServiceImpl();
		MovieUrlEntity movieUrlEntity=new MovieUrlEntity();
		movieUrlEntity.setId(UUidTools.getuuid());
		movieUrlEntity.setDesUrl("123");
		movieUrlEntity.setDesId("123");
		movieUrlDao.save(movieUrlEntity);
		System.out.println("hello world2");
	}

}
