package CodingQuestions;

import java.util.Scanner;

public class FaboncciSeriesThreeNumber {

	public static void main(String[] args) {

		int a = 0, b = 1, c = 2;

		System.out.print(a + " " + " " + b + " " + c + " ");

		for (int i = 4; i <= 10; i++) {

			int next = a + b + c;
			System.out.print(next + " ");

			a = b;
			b = c;
			c = next;

		}

	}
}
