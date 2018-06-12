package com.codingdojo.web.models;




public class NumberGame {
	int guess;
	
	public NumberGame(int guess, int randomNumber) {
		
	}

	public String CheckAnswer(int guess, int randNum) {
		// TODO Auto-generated method stub
		if(guess > randNum) {
			return "Too high";
		}else if(guess < randNum){
			return "Too Low";
		}
		return "you win";
	}

	
}
