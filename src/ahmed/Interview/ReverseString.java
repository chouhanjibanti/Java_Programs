//package ahmed.Interview;
//
//public class ReverseString {
//
//	public static void main(String[]args) {
//		
//		String s = "debugshala";
//		
//		String s1 = " ";
//		
//		for(int i=0;i<s.length();i++) {
//			 
//			s1  = s.charAt(i) + s1;
//			
//		}
//		
//		System.out.println(s1);
//	}
//}


package ahmed.Interview;

public class ReverseString {

	public static void main(String[]args) {
		
		String s = "debugshala html css java ";
		
		String s1[] = s.split(" ");
		String s2 = " ";
		
		for(int i=s1.length-1;i>=0;i--) {
			  
			s2 = s2 + " " + reverse(s1[i]);
			
		}
		
		System.out.println(s2);
	}

	private static String reverse(String s2) {
		
		String s3 = " ";
		
		for(int i=0;i<s2.length();i++) {
			 
			s3 = s2.charAt(i) + " " + s3;
		}
		
		return s3;	
	}
}








