package com.jpacrud;

import com.jpacrud.dao.UserRepository;
import com.jpacrud.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpacrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpacrudApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user = new User();
//		user.setName("Rutvik Jasani");
//		user.setCity("Surat, Gujarat");
//		user.setStatus("Owner");

//		Single Data Insert
//		User save = userRepository.save(user);
//		System.out.println(save);

//		Multiple Data Insert
//		User user1 = new User();
//		user1.setName("RJ");
//		user1.setCity("Bhavnagar");
//		user1.setStatus("Developer");
//
//		User user2 = new User();
//		user2.setName("Senbhai");
//		user2.setCity("Rajkot");
//		user2.setStatus("Developer");
//
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		for (User u : result) {
//			System.out.println(u);
//		}


//		Update Data
//		Optional<User> optional = userRepository.findById(2);
//		User user3 = optional.get();
//
//		user3.setName("Dhruvin Palsana");
//		user3.setCity("Amreli");
//		user3.setStatus("Manager");
//		User save = userRepository.save(user3);
//		System.out.println(save);


//		Get Data
//		userRepository.findAll().forEach(System.out::println);

//		Delete Data
//		using Id
//		userRepository.deleteById(102);

//		using object
//		Optional<User> optional = userRepository.findById(53);
//		User user4 = optional.get();
//		userRepository.delete(user4);

		// Custom Finder methods use
//		List<User> users = userRepository.findByName("RJ");
//		users.forEach(t -> System.out.println(t));

//		using Query Method
		List<User> users = userRepository.getAllUser();
		users.forEach(t -> System.out.println(t));
	}

}
