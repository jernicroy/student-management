package ip.spring.boot.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ip.spring.boot.model.Student;
import ip.spring.boot.repository.StudentRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public List<Student> fetchAllStudents() {
		return repository.findAll();
	}

	public void saveData(Student student) {
		
		student.setId(UUID.randomUUID().toString());
		repository.save(student);
		
	}
	
	public Student updateStudent(Student student) {
		return repository.save(student);
	}
	
	public void deleteStudent(String id) {
		repository.deleteStudentById(id);
	}
	
//	repository.findStudentByEmail(student.getEmail())
//	.ifPresentOrElse(s->{
//		System.out.println(" \n"+ s +"\nAlready Exists: ");
//		throw new IllegalStateException();
//	}, ()->{
//		System.out.println("Inserting new row:\n" + student );
//		repository.insert(student);
//	});
}
