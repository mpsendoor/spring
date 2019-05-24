package vtt.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vtt.spring.dao.StudentDao;
import vtt.spring.entity.StudentBio;
import vtt.spring.service.StudentService;

@Service
@Transactional
public class ServiceImpl implements StudentService {

	@Autowired
	StudentDao sd;
	
	@Override
	public StudentBio getOneStudent(int id) {
		// TODO Auto-generated method stub
		return sd.getOneStudent(id);
	}

	@Override
	public List<StudentBio> getAllStudent() {
		// TODO Auto-generated method stub
		return sd.getAllStudent();
	}

	@Override
	public Boolean saveStudent(StudentBio sb) {
		// TODO Auto-generated method stub
		return sd.saveStudent(sb);
	}

	@Override
	public Boolean updateStudent(int id, StudentBio sb) {
		// TODO Auto-generated method stub
		return sd.updateStudent(id, sb);
	}

	@Override
	public Boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return sd.deleteStudent(id);
	}

	@Override
	public StudentBio getStudentByName(String name) {
		// TODO Auto-generated method stub
		return sd.getStudentByName(name);
	}

}
