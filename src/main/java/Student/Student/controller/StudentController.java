package Student.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Student.Student.entity.Student;
import Student.Student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@GetMapping("/Getall")
	public List getall() {
		return service.getall();	
	}
	
	@PostMapping("/add")
	public String addrecords(@RequestBody Student s) {
		return service.addrecords(s);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Student s) {
		return service.update(s);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable int id) {
		return service.deletebyid(id);
		
	}
}
