package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	String input=JOptionPane.showInputDialog("When is your birthday?");
	
	if(input.equals("August 1")){
	System.out.println("HAPPY BIRTHDAY!!!");
}
	else{
		System.out.println("HAPPY unbirthday");
	}
}
}