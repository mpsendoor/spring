package vtt.spring.dao;

import java.util.List;

import vtt.spring.entity.StudentBio;

public interface StudentDao {
	
	public StudentBio getOneStudent(int id);
	public StudentBio getStudentByName(String name);
	public List<StudentBio> getAllStudent();
	public Boolean saveStudent(StudentBio sb);
	public Boolean updateStudent(int id, StudentBio sb);
	public Boolean deleteStudent(int id);
	
}
