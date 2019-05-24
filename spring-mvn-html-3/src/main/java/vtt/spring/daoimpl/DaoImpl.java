package vtt.spring.daoimpl;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vtt.spring.dao.StudentDao;
import vtt.spring.entity.StudentBio;



@Repository
public class DaoImpl implements StudentDao {

	@Autowired
	SessionFactory sf;
	
	@Autowired
	StudentBio sb;
	
	@Override
	public StudentBio getOneStudent(int id) {
		// TODO Auto-generated method stub
		String query = "From StudentBio where id = :ids";
		Query qry = sf.getCurrentSession().createQuery(query);
		qry.setParameter("ids", id);
		sb = (StudentBio) qry.getSingleResult();
		return sb;
//		return sf.getCurrentSession().get(StudentBio.class, id);
	}

/*	@Override
	public List<StudentBio> getAllStudent() {
		// TODO Auto-generated method stub
//		String hql = "from StudentBio";
//		Query qry = sf.getCurrentSession().createQuery(hql);
		
		String hql = "select * from stu_bio order by id desc limit 0,3";
//		String hql ="select *,sum(b.mark) as 'Total' from stu_bio a join stu_bio b on a.id = b.id";
		SQLQuery qry = sf.getCurrentSession().createSQLQuery(hql);
		qry.addEntity(StudentBio.class);
		
//		qry.addEntity(StudentMark.class);
		return qry.getResultList();
//		return sf.getCurrentSession().createCriteria(StudentBio.class).list();
		
	}*/

	@Override
	public Boolean saveStudent(StudentBio sb) {
		// TODO Auto-generated method stub 
		int a = (int) sf.getCurrentSession().save(sb);
		System.out.println("Return value : "+a);
		return a>0?true:false;
	}

	@Override
	public Boolean updateStudent(int id, StudentBio sb) {
		// TODO Auto-generated method stub
		String hql = "update StudentBio set id = :id where id = 111";
		Query qry = sf.getCurrentSession().createQuery(hql);
		qry.setParameter("id", id);
		int result = qry.executeUpdate();
		return result >= 1 ? true : false;
	}

	@Override
	public Boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		String hql = "delete from StudentBio where id = :id";
		Query qry = sf.getCurrentSession().createQuery(hql);
		qry.setParameter("id", id);
		int result = qry.executeUpdate();
//		sf.getCurrentSession().delete(StudentBio.class);
		
		return result >=1 ? true : false;
	}

	@Override
	public StudentBio getStudentByName(String name) {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		Query qry = session.createQuery("from StudentBio where name = :name");
		qry.setParameter("name", name);
		sb = (StudentBio) qry.getSingleResult();
		return sb;
//		return sf.getCurrentSession().get(StudentBio.class, name);
	}

	@Override
	public List<StudentBio> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
