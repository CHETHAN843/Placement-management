package com.tnsif.Certification;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	
	@Id
	private long id;
	private String name;
    private String email;
    private String course;
    private String year;
    private String certifications;
	public Certificate() {
		super();
		
	}
	public Certificate(long id, String name, String email, String course, String year, String certifications) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
		this.year = year;
		this.certifications = certifications;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCertifications() {
		return certifications;
	}
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + ", email=" + email + ", course=" + course + ", year=" + year
				+ ", certifications=" + certifications + "]";
	}
    
	

}
