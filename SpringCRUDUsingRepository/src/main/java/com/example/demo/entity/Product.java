package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productid")
	private int productid;
	@Column(name="productname")
	private String productname;
	@Column(name="productdes")
	private String productdes;
	@Column(name="unitprice")
	private float unitprice;
	public Product()
	{
		
	}
	public Product(int productid, String productname, String productdes, float unitprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productdes = productdes;
		this.unitprice = unitprice;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdes() {
		return productdes;
	}
	public void setProductdes(String productdes) {
		this.productdes = productdes;
	}
	public float getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}
	

}
