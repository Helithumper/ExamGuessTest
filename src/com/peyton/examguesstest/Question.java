package com.peyton.examguesstest;

import java.util.Random;

public class Question {
	private Boolean[] answers;
	private Random randomizer = new Random();
	
	public Boolean[] getAnswers() {
		return answers;
	}
	public void setAnswers(Boolean[] answers) {
		this.answers = answers;
	}
	
	public Question(int numAnswers, Boolean random){
		answers = new Boolean[numAnswers];
		if(random){
			int answerNum = randomizer.nextInt(numAnswers);
			answers[answerNum] = true;
		}
		for(int i = 0; i < answers.length; i++){
			if(answers[i]==null){
				answers[i]=false;
			}
		}
	}
	public Question(int numAnswers, int answer){
		answers = new Boolean[numAnswers];
		answers[answer] = true;
		for(int i = 0; i < answers.length; i++){
			if(answers[i]==null){
				answers[i]=false;
			}
		}
	}
}
