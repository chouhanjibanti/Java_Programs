package ahmed.Interview;

public class PrimeNumber2 {

	public static void main(String[] args) {
		
		
		 for (int i = 2; i <= 100; i++) {

	            int count = 0;
	            for (int j = 2; j <= i/2; j++) {
	                if (i % j == 0) {
	                    count++;
	                    
	                }
	            }
	            if (count == 0) {
	                System.out.println(i + " is a prime number");
	            }
	        }

	}
}

