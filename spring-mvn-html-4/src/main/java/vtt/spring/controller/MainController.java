package vtt.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vtt.spring.entity.StudentBio;
import vtt.spring.service.StudentService;

@RestController
public class MainController {
	
	@Autowired
	StudentBio sb;
	@Autowired
	StudentService ss;
	
	@RequestMapping(value = "/g", method = RequestMethod.GET)
	public StudentBio stu(@RequestParam("id") int id)
	{
		sb = ss.oneStudent(id);
		System.out.println("I am in StudentClass");
		return sb;
	}
}
