package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.service.ProductService;
@RestController
@RequestMapping("/product")
public class ProductController
{
	@Autowired
	ProductService service;
	@GetMapping("/list")
	public List<Product>findAll()
	{
		return service.findAll();
		
	}
	@GetMapping("/findbyId/{id}")
	public Product findById(@PathVariable int id)
	{
		
		return service.findById(id);
	}
	@PostMapping("/save")
	public void save(@RequestBody Product p)
	{
		p.setProductid(0);
		 service.saveorUpdate(p);
	}
	@PutMapping("/update")
	public void Update(@RequestBody Product p)
	{
		 service.saveorUpdate(p);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		Product e=findById(id);
		if(e==null)
		{
			throw new ProductNotFoundException("delete id not found");
		}
		else
		{
			service.deleteById(id);
		}
		return "Product"+id;
	}

}
