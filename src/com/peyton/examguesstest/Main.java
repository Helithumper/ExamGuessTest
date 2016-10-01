package com.peyton.examguesstest;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("How do the odds compare between random answers and a set answer");
		Scanner reader = new Scanner(System.in);
		System.out.println("How many questions? :");
		int length = reader.nextInt();
		
		System.out.println("How many Choices per Question? :");
		int choices = reader.nextInt();
		
		Question[] test = new Question[length];
		
		for(int i = 0; i < test.length; i++){
			test[i] = new Question(choices,true);
		}
		System.out.println("Choose a number between 0 and " + choices + " :");
		int constant = reader.nextInt();
		
		
		System.out.println("Simulating Test: ");
		
		//EVALUATE
		int numCorrectConstant = 0;
		int numCorrectRandom = 0;
		
		Random randomizer = new Random();
		
		int questionsCompleted = 0;
		
		for(Question q:test){
			int randomChoice = randomizer.nextInt(choices);
			if(q.getAnswers()[constant] == true){
				numCorrectConstant++;
			}
			if(q.getAnswers()[randomChoice] == true){
				numCorrectRandom++;
			}
			int correct = 0;
			for(int i = 0; i < q.getAnswers().length;i++){
				if(q.getAnswers()[i]){
					correct = i;
				}
			}
			questionsCompleted ++;
			System.out.println("Completed #: " + questionsCompleted + "\t Remaining #: " +(int)(test.length-questionsCompleted));
			System.out.println("Correct was: " + correct + "\t Random Chose: " + randomChoice + "\t Constant Chose: " + constant);
		}
		
		System.out.println("Results: \n\tTotal Questions: " + test.length + "\n\tConstant Choice Correct: " + numCorrectConstant + "\n\t" + "Random Choice Correct: " + numCorrectRandom);
	}
}
