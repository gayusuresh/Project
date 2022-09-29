package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Product;
@RepositoryRestResource(path="jpa")
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	

}
