package com.springboot.sql.com.sql_example.model;

import javax.persistence.*;

@Entity
@Table(name = "student", catalog="mydb")
public class student {
	
	
	private String sname;
	@Id
	@Column
	private Integer sid;
	private String semail;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	
	

}
