package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Happiness {
public static void main(String[] args) {
	String ant = JOptionPane.showInputDialog("are you currently ok");
	if(ant.equals("yes")) {
		JOptionPane.showMessageDialog(null, "... that is shocking. I will leave you to your success.");
	}
	else if(ant.contentEquals("no")) {
		String aol = JOptionPane.showInputDialog("do you want to be ok");
		if(aol.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Do something different. Whatever you're doing isnt working.");
		}
		else if(aol.equals("no")) {
			JOptionPane.showMessageDialog(null, "SAAAAME. well, i wont bother you anymore.");
		}
	}
}
}
