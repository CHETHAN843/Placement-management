package com.tnsif.Certification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class CertificationController {
	
	@Autowired
	private Certification service;
	
	
	@GetMapping("/Certification")
	public List<Certificate> list()
	{
		return service.listAllRecords();
	}
	
	@PostMapping("/Certification")
	public void add(@RequestBody Certificate certi)
	{
		service.InsertcertificationsRecord(certi);
	}
	
	@GetMapping("/Certification/{id}")
	
	public ResponseEntity<Certificate> get(@PathVariable Long id)
	{
		try
		{
			Certificate certi=service.getSingleRecord(id);
			return new ResponseEntity<Certificate>(certi,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/Certification/{id}")
	public void delete(@PathVariable Long id)
	{
		service.delete(id);
	}

}
