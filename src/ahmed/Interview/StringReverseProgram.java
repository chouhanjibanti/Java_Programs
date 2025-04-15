package ahmed.Interview;

import java.util.Scanner;

public class StringReverseProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String s = scan.nextLine();
		String str = " ";
		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			str = s1[i] + " " + str;
		}
		System.out.println(str);

	}

}
