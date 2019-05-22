package vtt.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vtt.spring.dao.StudentDAO;
import vtt.spring.daoimpl.DAOImpl;
import vtt.spring.entity.StudentBio;
import vtt.spring.service.StudentService;

@Service
@Transactional
public class ServiceImpl implements StudentService {

	@Autowired
	StudentDAO sd;
	
	@Override
	public StudentBio oneStudent(int id) {
		// TODO Auto-generated method stub
		return sd.oneStudent(id);
	}

	@Override
	public List<StudentBio> allStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveStudent(StudentBio sb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(StudentBio sb, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
