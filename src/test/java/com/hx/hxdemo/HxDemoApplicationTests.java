package com.hx.hxdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HxDemoApplicationTests {

	@Test
	public void contextLoads() {

		System.out.println("once");
		System.out.println("twice");
		System.out.println("third");
	}

}
