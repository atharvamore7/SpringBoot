package Student.Student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Student.Student.entity.Student;

@Repository
public class StudentDao {
	@Autowired 
	SessionFactory sf;
	public List getall() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}
	public String addrecords(Student s) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(s);
		tr.commit();
		return "Record added";
	}
	public String update(Student s) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(s);
		tr.commit();
		return "Data updated";
	}
	public String deletebyid(int s) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student ss = session.load(Student.class, s);
		ss.setId(s);
		session.delete(ss);
		tr.commit();
		return "Data deleted";
	}

}
