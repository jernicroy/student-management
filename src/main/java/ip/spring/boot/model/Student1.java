package ip.spring.boot.model;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Student1 {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private Gender gender;
	@Indexed(unique = true)
	private String email;
	private Address address;
	private List<String> favouriteSubjects;
	private LocalDateTime created;
	
	public Student1(String firstName, String lastName, int age, Gender gender, String email, Address address,
			List<String> favouriteSubjects, LocalDateTime created) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.favouriteSubjects = favouriteSubjects;
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getFavouriteSubjects() {
		return favouriteSubjects;
	}

	public void setFavouriteSubjects(List<String> favouriteSubjects) {
		this.favouriteSubjects = favouriteSubjects;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + ", address=" + address + ", favouriteSubjects="
				+ favouriteSubjects + ", created=" + created + "]";
	}
	
	
}
