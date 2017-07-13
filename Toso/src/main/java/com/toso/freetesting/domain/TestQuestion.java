package com.toso.freetesting.domain;

import java.util.ArrayList;
import java.util.List;

public class TestQuestion {

	private List<QuestionAnswer> answers;
	private List<Integer> correctAnswers;
	private String explanation;
	private String question;
	private int id;
	
	public QuestionAnswer getAnswer(int id){
		for (int i=0;i<this.answers.size();i++){
			if(this.answers.get(i).getId()==id)
				return this.answers.get(i);
		}
		return null;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TestQuestion(){
		this.answers=new ArrayList<QuestionAnswer>();
		this.correctAnswers = new ArrayList<Integer>();
	}
	public void insertCorrectAnswer(int answer) {
		this.correctAnswers.add(answer);
	}
	public void insertAnswer (QuestionAnswer answer){
		this.answers.add(answer);
	}
	public List<QuestionAnswer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<QuestionAnswer> answers) {
		this.answers = answers;
	}
	public List<Integer> getCorrectAnswers() {
		return correctAnswers;
	}
	public void setCorrectAnswers(List<Integer> correctAnswers) {
		this.correctAnswers = correctAnswers;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
}
