
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Febuary 21th";
		String dadsBirthday = "Febuary 9th";
		String myBirthday = "June 19th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bdoi = JOptionPane.showInputDialog("who's birthday would you like");
		// 3. Print out what the user typed
		System.out.println(bdoi);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (bdoi.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
else if (bdoi.equalsIgnoreCase("dad")) {
	System.out.println(dadsBirthday);
}
		// 6. if user asked for your name
			// print myBirthday
else if (bdoi.equalsIgnoreCase("bronte")) {
	System.out.println(myBirthday);
}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
else {
	System.out.println("Aye mate, we don't know who that is."); 
}
	} 
}
