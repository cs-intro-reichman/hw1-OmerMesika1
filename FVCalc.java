// Computes the future value of a saving investment.

import java.util.Scanner;

public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int Currentvalue = Integer.parseInt(args[0]);
		Double inputrate = Double.parseDouble(args[1]);
		double rate = (inputrate/100) + 1;
		int years = Integer.parseInt(args[2]);
		int printsum = (int) ((Currentvalue * Math.pow(rate, years))); //the formula that has shown in the instruction
		System.out.println("After " + years + " years, a $" + Currentvalue + " saved at " + inputrate + "% will yield $"+printsum);
	}
}