package CodingQuestions;

public class OccurenceStringChar {

	
	public static void main(String[]args) {
		
		String s = "programmingjavaprogram";
		
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
			  if(s.charAt(i) == s.charAt(j) && i>j) {
				  break;
			  }
			  if(s.charAt(i) == s.charAt(j) ) {
				  count++;
			  }
			}
			// find the  occurrence of the character who occur more then one time 
			if(count>0) {
				System.out.println("number of occurence is "+s.charAt(i)+ count);
			}
			// find the character who occur only one time 
			if(count==1) {
				System.out.println("number of occurence is "+s.charAt(i)+ count);
			}

		}
		
		
	}
}
