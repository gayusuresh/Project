package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepository;
import com.example.demo.entity.Product;
@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductRepository dao;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Product findById(int id) {
		Optional<Product>p= dao.findById(id);
		Product p1=null;
		if(p.isPresent())
		{
			p1=p.get();
		}
		return p1;
	}

	@Override
	public void saveorUpdate(Product p) {
           dao.save(p);		
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);		
	}


}
