package com.toso.freetesting.technology;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.toso.freetesting.domain.Test;

public class XMLParser {
	@Autowired
	private Jaxb2Marshaller marshaller;
	
	public void marshal(Test test) {
		
		try {

			File file = new File("C:\\data\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Test.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(test, file);
			jaxbMarshaller.marshal(test, System.out);

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }
	}
		public Test unmarshalXML(String filename)
		{
			try {

				File file = new File(filename);
				JAXBContext jaxbContext = JAXBContext.newInstance(Test.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Test test = (Test) jaxbUnmarshaller.unmarshal(file);
				System.out.println(test);
				return test;

			  } catch (JAXBException e) {
				e.printStackTrace();
			  }
			return null;
		}
	
	
	
}
