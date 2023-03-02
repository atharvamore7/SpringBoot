package Student.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Student.Student.dao.StudentDao;
import Student.Student.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;
	public List getall() {
		return dao.getall();
	}
	public String addrecords(Student s) {
		return dao.addrecords(s);
	}
	public String update(Student s) {
		return dao.update(s);
	}
	public String deletebyid(int id) {
		return dao.deletebyid(id);
	}

}
