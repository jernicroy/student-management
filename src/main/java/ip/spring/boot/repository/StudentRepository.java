package ip.spring.boot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ip.spring.boot.model.Student;
import ip.spring.boot.model.Student1;

public interface StudentRepository extends MongoRepository<Student, String> {
	Optional<Student1> findStudentByEmail(String email);
	
	void deleteStudentById(String id);
	
	List<Student> findAll();
}
