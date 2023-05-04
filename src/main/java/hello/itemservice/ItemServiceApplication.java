package hello.itemservice;

import hello.itemservice.web.validation.ItemValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ItemServiceApplication implements WebMvcConfigurer {
	// 커밋 Test3

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}


//	@Override
//	public Validator getValidator() { //글로벌 설정
//		return new ItemValidator();
//	}

}
