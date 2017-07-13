package com.toso.freetesting.technology;

import  com.toso.freetesting.domain.*;


public class TestRepository implements ITestRepository {

	@Override
	public void persist(Test test) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Test find(String testName) {
		// TODO Auto-generated method stub
		//select * from some database table...
		//fill the Test object properties...
		return null;
	}

}
