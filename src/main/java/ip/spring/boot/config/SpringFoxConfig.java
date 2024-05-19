package ip.spring.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

//@Configuration
//@EnableSwagger2
//public class SpringFoxConfig {
//
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("ip.spring.boot.controller"))
//				.paths(PathSelectors.regex("/.*")).build().apiInfo(apiInfo());
//	}
//
//	private ApiInfo apiInfo() {
//	  return new ApiInfoBuilder()
//	      .title("My Students portal application")
//	      .description("This is a test of documenting EST API's")
//	      .version("V1.2")
//	      .termsOfServiceUrl("http://terms-of-services.url")
//	      .license("LICENSE")
//	      .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//	      .build();
//	}
//}


@Configuration
public class SpringFoxConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.components(new Components())
				.info(new Info()
						.title("My Students Portal Application")
						.description("Swagger configuration for this application"));
	}
}