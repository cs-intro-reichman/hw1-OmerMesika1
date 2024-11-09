// Splits a restaurant bill evenly among three diners.

import java.util.Scanner;

public class Bill3 {
	public static void main(String[] args) {
		String name01 = args[0];
		String name02 = args[1];
		String name03 = args[2];
	    int billamount01 = Integer.parseInt(args[3]);
		double billamount02 = Math.ceil((billamount01/3.0));
		System.out.println("Dear "+ name01 + ", " + name02 + ", and " + name03 + ": pay " + billamount02 + " Shekeles each");
	}
}
