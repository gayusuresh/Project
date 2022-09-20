package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructordetail")
public class InstructorDetail 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="youtubeChanel")
	private String youtubeChanel;
	@Column(name="hobby")
	private String hobby;
	public InstructorDetail()
	{
		
	}
	public InstructorDetail(String youtubeChanel, String hobby) {
		super();
		
		this.youtubeChanel = youtubeChanel;
		this.hobby = hobby;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYoutubeChanel() {
		return youtubeChanel;
	}
	public void setYoutubeChanel(String youtubeChanel) {
		this.youtubeChanel = youtubeChanel;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	

	

}
