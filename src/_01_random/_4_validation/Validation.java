//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You’re an awesome friend.");
		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You light up the room."); 
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You have a great sense of humor.");
		} else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "I appreciate you.");
		// 3. Find someone to test out your program. They will like it :)
	}
	}}
