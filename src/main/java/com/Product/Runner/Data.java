package com.Product.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.Product.Entity.Admin;
import com.Product.Repository.AdminRepo;
@Component
public class Data implements CommandLineRunner{
	@Value("${admin.user.name}")			// it accept from the   spring properties
	String userName;
	@Value("${admin.user.pass}")
	String pass;
	@Autowired
	AdminRepo repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		admin.setName(userName);
		admin.setPass(pass);
		repo.save(admin);
	}


}
