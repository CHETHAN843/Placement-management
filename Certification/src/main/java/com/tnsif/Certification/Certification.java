package com.tnsif.Certification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class Certification {
	
	@Autowired
	private CertificatioRepository repo;
	
	// for data base
	public void InsertcertificationsRecord(Certificate certi)
	{
		repo. save(certi);
		
	}
    // get all records
	
	public List<Certificate> listAllRecords()
	{
		return repo.findAll();
	}
	
	// retrieving particular record  
	
	public Certificate getSingleRecord(Long id)
	{
		return repo.findById(id).get();
	}
	
	// deleting the record
	
	public void delete(Long id)
	{
		repo.deleteById(id);
	}


	
	
}
