package ip.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate) {
//		return args -> {
//			Address address = new Address("Nagercoil",629002,"India");
//
//			Student1 student1 = new Student1("Jernic","Roy",23,Gender.MALE, "jernicroy@nomail.com",address, List.of("Maths","CS"),LocalDateTime.now()) ;
//			
////			usingMongoTemplateAndQuery(repository,mongoTemplate,student);
//			repository.findStudentByEmail(student1.getEmail())
//										.ifPresentOrElse(s->{
//											System.out.println(" \n"+ s +"\nAlready Exists: ");
//										}, ()->{
//											System.out.println("Inserting new row:\n" + student1 );
//											repository.insert(student1);
//										});
//		};
//	}
	
//	@Bean
//	public CorsFilter corsFilter() {
//		List<String> allowedOrigins = new ArrayList<>();
//		allowedOrigins.add("http://example.com");
//		allowedOrigins.add("http://localhost:4200");
//		
//		CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowCredentials(true);
//		configuration.setAllowedOrigins(allowedOrigins);
//		
//		List<String> allowedHeaders = new ArrayList<String>();
//		allowedHeaders.add("Origin");
//		allowedHeaders.add("Access-control-Allow-Origin");
//		allowedHeaders.add("Content-Type");
//		allowedHeaders.add("Origin, Accept");
//		configuration.setAllowedHeaders(allowedHeaders);
//		
//		List<String> allowedMethods = new ArrayList<>();
//		allowedMethods.add("GET");
//		allowedMethods.add("POST");
//		configuration.setAllowedMethods(allowedMethods);
//		
//		List<String> exposedHeaders = new ArrayList<>();
//		exposedHeaders.add("Origin");
//		exposedHeaders.add("Access-control-Allow-Origin");
//		exposedHeaders.add("Content-Type");
//		exposedHeaders.add("Authorization");
//		configuration.setExposedHeaders(exposedHeaders);
//		
//		UrlBasedCorsConfigurationSource urlBase = new UrlBasedCorsConfigurationSource();
//		urlBase.registerCorsConfiguration("/**", configuration);
//		return new CorsFilter(urlBase);
//	}
	
//	private static void usingMongoTemplateAndQuery(StudentRepository repository,MongoTemplate mongoTemplate, Student1 student1) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("email").is(student1.getEmail()));
//		
//		List<Student1> student1s = mongoTemplate.find(query, Student1.class);
//		
//		if(student1s.size()>1) {
//			throw new IllegalStateException("found many students with email"+student1.getEmail());
//		}else if(student1s.isEmpty()) {
//			System.out.println("Inserting new row:\n");
//			repository.insert(student1);
//		}else {
//			System.out.println("Already Exists: ");
//		}
//	}
}
