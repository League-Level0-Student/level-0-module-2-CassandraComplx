//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {

	// 1. Make a main method that includes all the steps below
		JOptionPane.showInputDialog("ask a question");
	// 2. Get the user to enter a question for the 8 ball to answer
	

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
		int number = 0;
			Random ran = new Random();
		
			for (int i=0; i<1; i++) {
				number = ran.nextInt( 3 - 1 + 1 ) + 1;
				System.out.println(number);
			}
	// 4. If the random number is 0
if (number == 0) {
	JOptionPane.showMessageDialog(null, "Yes");
} else if (number == 1) {
	JOptionPane.showMessageDialog(null, "no");
} else if (number == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
} else if (number == 3) {
	JOptionPane.showMessageDialog(null, "maybe");
}
	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}}
