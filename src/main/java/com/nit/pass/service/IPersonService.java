package com.nit.pass.service;

import com.nit.pass.model.Person;

public interface IPersonService {

	public String passportRegistration(Person person);
	public String findBirthCertificate(String str);
	
}
