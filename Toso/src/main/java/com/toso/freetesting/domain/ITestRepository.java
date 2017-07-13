package com.toso.freetesting.domain;

public interface ITestRepository {
	
	void persist (Test test);
	Test find (String testName);		
	

}
