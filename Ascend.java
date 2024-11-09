// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Scanner;

public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int limit = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * (limit));
		int b = (int) (Math.random() * (limit));
		int c = (int) (Math.random() * (limit));
		int min,mid,max;
		min = Math.min(a,Math.min(b, c));
		max = Math.max(a,Math.max(b, c));
		mid = (a+b+c) - (min+max);
		System.out.println(a + " " + b + " " + c + " ");
		System.out.println(min + " " + mid + " " + max + " ");
}
	}
