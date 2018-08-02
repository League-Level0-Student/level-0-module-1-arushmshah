package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog(null, "What is 68x2?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(input.equals("136")){
	System.out.println("Your Correct!!!");
score+=1;	
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	System.out.println("Your Wrong");
}
		// 6. Add some more riddles
String input2 = JOptionPane.showInputDialog(null, "What is 70x2?");
if(input2.equals("140")){
	System.out.println("Your Correct!!!");
score+=1;	
}
else {
	System.out.println("Your Wrong");
}


		// 2. Make a pop up to show the score.
System.out.println("Score: " +score);
	}
}

