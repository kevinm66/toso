package com.toso.freetesting.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Test {
	int testDuration;
	int numberOfQuestions;
	String name;
	
	public TestQuestion getQuestion(int id) {
		for (int i=0;i<this.testQuestion.size();i++){
			if(this.testQuestion.get(i).getId()==id)
				return this.testQuestion.get(i);
		}
		return null;
	}
	
	public Test(){
		testQuestion=new ArrayList<TestQuestion>();
	}
	private List<TestQuestion> testQuestion;
	
	public void insertQuestion(TestQuestion question) {
		this.testQuestion.add(question);
	}
	
	public int getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(int testDuration) {
		this.testDuration = testDuration;
	}
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}
	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TestQuestion> getTestQuestions() {
		return testQuestion;
	}
	public void setTestQuestions(List<TestQuestion> testQuestions) {
		this.testQuestion = testQuestions;
	}
	

}
