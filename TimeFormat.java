// Represents the hh:mm time format using an AM/PM format. 

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours;
		// Does the same with the minutes part of the input.
		String minutes;
        // Replace this comment with the rest of your code
		Scanner Scan1 = new Scanner(System.in);
		String hourinput = args[0];
		hours = Integer.parseInt(hourinput.substring(0,2));
		minutes =hourinput.substring(3,5);
		if(hours>12) {
			System.out.println(hours-12 + ":" + minutes + " PM");
		} else {
			System.out.println(hours + ":" + minutes + " AM");
		}
	}
}