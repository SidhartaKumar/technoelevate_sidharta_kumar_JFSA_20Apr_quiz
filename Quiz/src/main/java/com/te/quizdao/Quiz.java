package com.te.quizdao;

import java.util.Date;

import com.te.quizhibernate.QuizQuestions;
import com.te.quizhibernate.Register;
import com.te.quizhibernate.Results;

interface Quiz {
	
	abstract  Register login(String username,String Password);
	
	abstract  Register register(Register register);
	
	abstract QuizQuestions questions(int id);
	
	abstract void results(Results results);
	
	abstract Results getResults(Date date);

}
