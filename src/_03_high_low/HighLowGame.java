//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(5);
		
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String input = JOptionPane.showInputDialog("Guess the number (it's between 0 and 5)");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
int jol= Integer.parseInt(input);
			// 5. if the guess is correct
if(jol==random) {
	JOptionPane.showMessageDialog(null, "Who new you were psychic!? You win.");
System.exit(0);
}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.

			// 7. if the guess is high
else if(jol>random) {
	JOptionPane.showMessageDialog(null, "A little too high. Better get a crystal ball to help you out next time.");
}
				// 8. Tell them it's too high
			// 9. if the guess is low
else if(jol<random) {
	JOptionPane.showMessageDialog(null, "Sorry mate. Seems like you can't tell the future.");
}
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


