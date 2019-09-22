package com.nit.pass.id;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.nit.pass.model.Person;

public class CustomIdGen implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		Person person=(Person) object;
		String pname=person.getFirstName();
		String str=pname.substring(0,3);
		int random1=new Random().nextInt(10000);
		int random2=new Random().nextInt(9999);
		str="P-"+str+"-"+random1+random2;
		return str;
	}

}
