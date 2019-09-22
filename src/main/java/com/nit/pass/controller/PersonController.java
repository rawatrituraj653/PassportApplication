package com.nit.pass.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nit.pass.model.Person;
import com.nit.pass.service.IPersonService;

@Controller
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private IPersonService service;
	
	@RequestMapping("/show")
	public String  getRegPage(Model model) {
		
		model.addAttribute("person", new Person());
		
		return "passport-register";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String enrollForBirtCertificate(@ModelAttribute  Person person ,Model model) throws ParseException {
		System.out.println(person);
		String date=person.getDate();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date dob=format.parse(date);
		person.setDob(dob);
		System.out.println(person);
		
		String id=service.passportRegistration(person);
		if(id!=null) {
		model.addAttribute("msg","your Passport Registration successfully your passport No. ::"+id);
		model.addAttribute("person", new Person());
		}else {
			model.addAttribute("msg","your Passport Registration Failed  Try Again...!!");
			model.addAttribute("person", person);
		}
		
		
		return "passport-register";
	}
	
}
