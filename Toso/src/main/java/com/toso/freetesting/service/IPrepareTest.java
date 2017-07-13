package com.toso.freetesting.service;
import com.toso.freetesting.domain.*;
import com.toso.freetesting.technology.TestRepository;
import com.toso.freetesting.technology.XMLParser;

public interface IPrepareTest {

	public Test prepare (String testName);
		
	
}
