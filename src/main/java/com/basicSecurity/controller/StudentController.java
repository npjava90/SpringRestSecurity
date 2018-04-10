package com.basicSecurity.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basicSecurity.model.Student;

@Controller
public class StudentController {
	
	@RequestMapping(path="/Student", method = RequestMethod.GET)
	public ResponseEntity<List<Student>>  listStudent(){
		return new ResponseEntity<List<Student>>(getStudents(), HttpStatus.OK);
	}
	
	@RequestMapping(path="/Student/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<Student>>  listStudent(@PathVariable(value = "id") String id){
		List<Student> Students = getStudents();
        if(Students.isEmpty()){
            return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Student>>(Students, HttpStatus.OK);
		
	}
	
	@RequestMapping(path="/Student", method = RequestMethod.POST)
	public ResponseEntity<String>  listStudent(@RequestBody Student Student){
		return new ResponseEntity<String>("18", HttpStatus.OK);
	}
	
	private List<Student> getStudents() {
		Student Student1 = new Student();
		Student1.setId("1");
		Student1.setEmail("np90@gmail.com");
		Student1.setName("nisarg");
		Student1.setAddress("Bangalore, Karnataka");
		
		Student Student2 = new Student();
		Student2.setId("2");
		Student2.setEmail("mohitp@yahoo.com");
		Student2.setName("Mohit patel");
		Student2.setAddress("Orissa");
		
		Student Student3 = new Student();
		Student3.setId("3");
		Student3.setEmail("krishnkumar@gmail.com");
		Student3.setName("krishn kumar");
		Student3.setAddress("Bangalore, Karnataka");
		
		Student Student4 = new Student();
		Student4.setId("4");
		Student4.setEmail("prakashshah@gmail.com");
		Student4.setName("Prakash shah");
		Student4.setAddress("Ahmedabad, Gujarat");
		return Arrays.asList(Student1, Student2, Student3, Student4);
	}


}
