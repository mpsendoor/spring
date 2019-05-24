package vtt.spring.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vtt.spring.entity.StudentBio;
import vtt.spring.service.StudentService;

@RestController
public class ViewController {
	
	@Autowired
	StudentService ss;
	@Autowired
	StudentBio sb;
	
	@RequestMapping(value="/g", method=RequestMethod.GET)
	public StudentBio g_m()
	{
		System.out.println("I am at GET in JAVA");
		sb.setId(109);
		sb.setName("muruga");
		sb.setAge(15);
		sb.setAdrs("velachery");
		sb.setStd("10th");
//		boolean result = ss.saveStudent(sb);
//		sb = ss.getOneStudent(109);
//		boolean result = ss.deleteStudent(0);
//		boolean result = ss.updateStudent(0, sb);		
		return ss.getOneStudent(101);
//		return ss.getAllStudent();
//		return ss.getStudentByName("spd");
		
//		return result? "Success" : "Failed";
	}
	
	@RequestMapping(value="/p", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public StudentBio p_m(@RequestBody StudentBio sb) throws IOException
	{
		System.out.println("I am at POST in JAVA");
		sb = ss.getOneStudent(sb.getId());
//		sb = ss.getStudentByName(sb.getName());
//		sb = ss.getOneStudent(id);
		
		return sb;
//		return sm;
//		return g_m();
	}
}
