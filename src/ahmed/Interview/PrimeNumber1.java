package ahmed.Interview;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt(); // e.g. input = 9
		int count = 0;

		for (int i = 2; i <= num / 2; i++) {
		    if (num % i == 0) {
		        count++; // Increments if num is divisible by i
		    }
		}

		if (count == 0) {
		    System.out.println(num + " is a prime number");
		} else {
		    System.out.println(num + " is not a prime number");
		}

	}

}
