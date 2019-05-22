package vtt.spring.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vtt.spring.dao.StudentDAO;
import vtt.spring.entity.StudentBio;

@Repository
public class DAOImpl implements StudentDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public StudentBio oneStudent(int id) {
		// TODO Auto-generated method stub
		return (StudentBio) sessionFactory.getCurrentSession().get(StudentBio.class, id);
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
