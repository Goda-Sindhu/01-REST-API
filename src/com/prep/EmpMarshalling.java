package com.prep;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class EmpMarshalling {

	public static void main(String[] args) throws Exception {
		Employee e = new Employee();
		e.setId(10);
		e.setName("Sindhu");
		e.setGender("Female");
		e.setMail("saisindu.madu97@gmail.com");
		
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(e, new File("Employee.xml"));
		System.out.println(e);
		System.out.println("Done");
	}

}
