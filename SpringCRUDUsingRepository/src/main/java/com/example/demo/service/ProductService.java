package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService 
{
	public List<Product>findAll();
	public Product findById(int id);
	public void saveorUpdate(Product p);
	public void deleteById(int id);

}
