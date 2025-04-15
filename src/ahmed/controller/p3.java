package ahmed.controller;

public class p3 {

	public static void main(String[] args) {

		String s = "java grooming class";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = " " + s + s.charAt(i);
			System.out.println(s1);
		}

	}
}
