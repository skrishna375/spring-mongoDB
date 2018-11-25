package com.study.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UsrRepository.class)
public class Application {
		
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User usr = new User();
		
		usr.setUsrId("krish375");
        usr.setPassword("krishan375");
        usr.setName("Krishna");
        usr.setCity("ttttt");
        usr.setEmail("email@gg.com");
        usr.setPhone("1234567890");

        System.out.println("Get user ID  : "+ usr.getUsrId());
        System.out.println("Get Password : "+ usr.getPassword());
        System.out.println("Get Name     : "+ usr.getName());
        System.out.println("Get City     : "+ usr.getCity());
        System.out.println("Get E-mail   : "+ usr.getEmail());
        System.out.println("Get Phone    : "+ usr.getPhone());

        RegistrationService reg = (RegistrationService)((BeanFactory) app).getBean("registrationService");
        reg.regUser(usr); 

	} */
	
}
