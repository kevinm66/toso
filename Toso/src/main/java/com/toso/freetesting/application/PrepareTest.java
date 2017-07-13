package com.toso.freetesting.application;
import com.toso.freetesting.domain.*;
import com.toso.freetesting.technology.TestRepository;
import com.toso.freetesting.technology.XMLParser;

public class PrepareTest {

	public Test prepare (String testName){
		XMLParser xml=new XMLParser();
		Test test1 = new Test();
		test1=xml.unmarshalXML("C:\\data\\file.xml");
		//ALEBO
		ITestRepository repository=new TestRepository();
		test1=repository.find("SOA");
		return test1;
	}
	
}
