package com.toso.freetesting.presentation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toso.freetesting.application.PrepareTest;
import com.toso.freetesting.domain.QuestionAnswer;
import com.toso.freetesting.domain.Test;
import com.toso.freetesting.domain.TestQuestion;
import com.toso.freetesting.service.IPrepareTest;
import com.toso.freetesting.technology.XMLParser;

@Controller
@Component
public class TestController {
	
	@RequestMapping("/test")
	public String test(Model model){
		XMLParser xml=new XMLParser();
		Test test = new Test();
		test=xml.unmarshalXML("C:\\data\\file.xml");
		model.addAttribute("test",test);
/*
		
		test.setName("SOA");
		test.setNumberOfQuestions(25);
		TestQuestion question=new TestQuestion();
		TestQuestion question1=new TestQuestion();
		QuestionAnswer answer=new QuestionAnswer();
		answer.setId(1);
		answer.setPossibleAnswer("Stano");
		question.setExplanation("Lebo som proste Stano");
		//questionAnswer.add(answer);
		question.setQuestion("AKo sa volam?");
		question1.setQuestion("Kedy som sa narodil?");
		question.insertAnswer(answer);
		question.insertCorrectAnswer(1);
		question.insertCorrectAnswer(2);
		test.insertQuestion(question);
		test.insertQuestion(question1);
		xml.marshal(test);
	*/
		
		return "test";
	}
	
	@RequestMapping("/test/run")
	public String testrun( Model model){
		/*
		XMLParser xml=new XMLParser();
		//List<QuestionAnswer> questionAnswer = new ArrayList<QuestionAnswer>();
		Test test1 = new Test();
		test1=xml.unmarshalXML("C:\\data\\file.xml");
		model.addAttribute("test",test1);
		*/
		Test test=new Test();
		
		@Autowired 
		IPrepareTest testPrepare;
		test=testPrepare.prepare("SOA");
		return "testrun";
	}

	
}
