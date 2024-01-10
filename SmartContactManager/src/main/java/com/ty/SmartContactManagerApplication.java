package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
@SpringBootApplication
public class SmartContactManagerApplication  implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SmartContactManagerApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
//		
//		String str="durgesh";
//		String encode = this.bryBCryptPasswordEncoder.encode(str);
//		System.out.println(encode);		
//		String str1="durgesh";
//		String encode2 = this.bryBCryptPasswordEncoder.encode(str1);		
//		System.out.println(this.bryBCryptPasswordEncoder.matches("durges352h",encode));
//		
	}

}
