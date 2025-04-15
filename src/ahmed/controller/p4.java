package ahmed.controller;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter the String ");
//		String s = scan.nextLine();

		String s = "java grooming class";

		String reverse = " ";
		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);

		}
		System.out.print("Reverse the String : " + reverse);
	}
}

//package ahmed.controller;
//
//import java.util.Scanner;
//
//public class p4 {
//
//    public static void main(String[] args) {

//        String s = "java grooming class";
//        String reverse = "";
//        int length = s.length();
//        int wordStart = length - 1;
//
//        for (int i = length - 1; i >= 0; i--) {
//            if (s.charAt(i) == ' ' || i == 0) {
//                int wordEnd = (i == 0) ? 0 : i - 1;
//                reverse = getReversedWord(s, wordEnd, wordStart) + " " + reverse;
//                wordStart = i - 1;
//            }
//        }
//
//        System.out.print("Reverse the String: " + reverse);
//    }
//
//    private static String getReversedWord(String s, int start, int end) {
//        char[] wordArray = new char[end - start + 1];
//        int index = 0;
//        for (int i = start; i <= end; i++) {
//            wordArray[index++] = s.charAt(i);
//        }
//        return new String(wordArray);
//    }
//}
