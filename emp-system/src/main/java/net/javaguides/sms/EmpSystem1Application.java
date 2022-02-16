package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Emp;
import net.javaguides.sms.repository.EmpRepository;

@SpringBootApplication
public class EmpSystem1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmpSystem1Application.class, args);
	}

	@Autowired
	private EmpRepository empRepository;
	
	@Override
	public void run(String... args) throws Exception {

		
		// Emp emp1 = new Emp("R", "F", "r@gmail.com");
		// empRepository.save(emp1);
		 
	
		 
		
	}
}
