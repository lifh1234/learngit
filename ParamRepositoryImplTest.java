package com.pdata.lifh.repository.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pdata.yifu.repository.ParamRepository;


@RunWith(SpringJUnit4ClassRunner.class)
// bean的配置文件路径，这个是Test类的classpath路径，如果是Spring推荐的目录结构，应该在：项目目录/src/test/resources/里
@ContextConfiguration(locations = { "classpath:spring-mvc.xml", "classpath:spring-mybatis.xml" })
public class ParamRepositoryImplTest {
	@Resource
	private ParamRepository paramRepository;

	@Test
	public void test() {
		System.out.println(paramRepository.getValue("llh", "max_uid"));
		//test
	}

}
