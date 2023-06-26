package com.prep;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class EmpUnmarshall {

	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employee e  = (Employee)unmarshaller.unmarshal(new File("Employee.xml"));
		System.out.println(e);
	}

}
