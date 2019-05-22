package vtt.spring.dao;

import java.util.List;

import vtt.spring.entity.StudentBio;

public interface StudentDAO {
	
	public StudentBio oneStudent(int id);
	public List<StudentBio> allStudent();
	public boolean saveStudent(StudentBio sb);
	public boolean updateStudent(StudentBio sb, int id);
	public boolean deleteStudent(int id);
}
