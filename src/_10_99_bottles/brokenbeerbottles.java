package _10_99_bottles;

public class brokenbeerbottles {
public static void main(String[] args) {
	for(int v=99; v>1; v--) {
		System.out.println(v+" bottles of bear on the wall, " +v+" bottles of bear");
		System.out.println("take one down, pass it around, " +(v-1)+ " bottles of bear on the wall");
		
	}
	System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\r\n" + 
			"Take one down and pass it around, no more bottles of beer on the wall.\r\n" + 
			"\r\n" + 
			"No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
			" Go to the store and buy some more, 99 bottles of beer on the wall.\r\n" + 
			"");
}
}
