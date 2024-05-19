package ip.spring.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ip.spring.boot.model.Student;
import ip.spring.boot.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;	
	
	private static final Logger log = LoggerFactory.getLogger(StudentController.class);
	
	@GetMapping("/all")
	public List<Student> fetchAllStudents(){
		System.out.println("Inside fetch all Controller");
		log.info("INSIDE /all info CONTROLLER");
		log.debug("INSIDE /all debug CONTROLLER");
		return studentService.fetchAllStudents();
	}
	
	@PostMapping("/save")
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        // Here you can perform operations with the student object received in the request body
        // For demonstration purposes, let's just return a response with the student's name
		try{
			studentService.saveData(student);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student already exists with email: " + student.getEmail());
		}
        return ResponseEntity.status(HttpStatus.CREATED).body("Student created with name: " + 
        																	student.getFirstName());
    }
	
    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student updateEmployee = studentService.updateStudent(student);
		System.out.println("Inside Update Controller");

        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") String id){
    	System.out.println("Inside Delete API: "+ id);
    	studentService.deleteStudent(id);
    	
    	return new ResponseEntity<>(HttpStatus.OK);
    }
}
