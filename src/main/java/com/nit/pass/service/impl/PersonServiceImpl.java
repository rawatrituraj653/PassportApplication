package com.nit.pass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.nit.pass.model.Person;
import com.nit.pass.repo.PersonRepository;
import com.nit.pass.service.IPersonService;

@Transactional
@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private PersonRepository repo;
	
	@Override
	public String passportRegistration(Person person) {
		String passportNo=null;
		String str =findBirthCertificate(person.getBcert());
		System.out.println(str);
		if(str.contains("valid")) {
		Person person2= repo.save(person);
		 passportNo=person2.getPersonId();
		 return passportNo;
		}
		return passportNo;
	}
	@Override
	public String findBirthCertificate(String str) {
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> isExist=template.getForEntity("http://localhost:9898/ESEVA_APP/rest/exist/"+str, String.class);
	
		return isExist.getBody(); 
	} 
	
}
