package com.Product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Product.Entity.Admin;

public interface AdminRepo extends JpaRepository<Admin,Integer>{

}
