package vtt.spring.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import vtt.spring.controller.MainController;
import vtt.spring.entity.StudentBio;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringJUnitWebConfig("classpath:config.xml")
//@ContextConfiguration("classpath:config.xml")
public class TestClass {

	@Test
	public void test() {
//		fail("Not yet implemented");
		
		MainController mc = new MainController();
				
		StudentBio sb = mc.stu(101);
		System.out.println("OutPut : "+sb.getName());
	}

}
