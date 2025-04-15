package ahmed.NormalProgram;

import java.util.Scanner;

//public class Simple1 
//{
//	public static void main(String[] args) 
//	{
//		int n=2814739,res=0,p=1;
//		while(n!=0) {
//        int r = n%10;
//		if(prime(r)){
//			res = r*p+res;
//			 p=p*10;
//      }
//		n = n/10;
//		}
//		 System.out.println(res);
//	}
//	
//public static boolean prime(int n){
//	int c=0;
//	if(n<2){
//		return false;
//	}
//	for(int i=2;i<=n/2;i++){
//		if(n%i==0){
//			c++;
//		}
//	}
//	return c==0;
//}
//}

//public class Simple1
//{
//	public static void main(String[] args) 
//	{
//		int str=0;
//		int spc=5;
//		for(int i=1;i<=5;i++){
//			spc--;
//			str++;
//     for(int j=1;j<=spc;j++)
//		 {
//		 System.out.print(" ");
//       }
//     for(int k=1;k<=str;k++)
//		 {
//		System.out.print("*");
//      }
//     System.out.println();
//	}
//	}
//}

//public class Simple1{
//	
//	public static void main(String[] args) {
//		
//		int n1=0,n2=1,n3=0;
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter the number : ");
//		int number = scan.nextInt();
//		
//		System.out.println(n1);
//		System.out.println(n2);
//		
//		for(int i=0;i<number;i++) {
//			n3 = n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
//		}
//	}
//}

//public class Simple1{
//	
//	public static void main(String[] args) {
//		
//		int f=1;
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter the number : ");
//		int n = scan.nextInt();
//		if(n==0) {
//			System.out.println("fact"+f);
//		}else {
//			for(int i=1;i<=n;i++) {
//				f=f*i;
//				
//			}
//			System.out.println(f);
//			
//		}
//	}
//}

// min and max in the array
// bubble sorting in the array

//public class Simple1{
//	public static void main(String[] args) {
//		
//		int no=6;
//		if(isPrime(no)) {
//			System.out.println("Number is prime "+no);
//		}else {
//			System.out.println("Number is not prime "+no);
//		}
//		
//	}
//	
//	public static boolean isPrime(int n) {
//		int count=0;
//		if(n<2) {
//			return false;
//		}
//		for(int i=2;i<=n/2;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		return count==0;
//		
//	}
//}

//min and max in the array

//public class Simple1{
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the size :");
//		int size = scan.nextInt();
//	
//		int[] arr = new int[size];
//		
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.println("Enter the element for index  : "+i);
//			arr[i]= scan.nextInt();
//		}
//		
////	     int max = arr[0];
//		int min = arr[0];
//	     
////	     for(int j=0;j<=arr.length-1;j++) {
////	    	 if(max<arr[j]) {
////	    		 max = arr[j];
////	    	 }
////	     }
//	     for(int j=0;j<=arr.length-1;j++) {
//	    	 if(min>arr[j]) {
//	    		 min = arr[j];
//	    	 }
//	     }
////	     System.out.println("Answer : "+max);
//	     System.out.println(min);
//		
//	}
//}

//bubble sorting in the array

//public class Simple1{
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the size ");
//		int size = scan.nextInt();
//		
//		int[] arr = new int[size];
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter the element for index : "+i);
//			arr[i]= scan.nextInt();
//		}
//		
//		for(int j=0;j<arr.length-1;j++) {
//			for(int k=1;k<arr.length-j;k++) {
//			   if(arr[k-1]>arr[k]) {
//				   int temp = arr[k-1];
//				   arr[k-1]=arr[k];
//				   arr[k]= temp;
//			   }
//			}
//		}
//		for(int a:arr) {
//			System.out.print(a);
//		}
//	}
//}

// string 

//public class Simple1{ // Banti
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the String :");
//		String s = scan.next();
//		String str = "";
//		
//		for(int i=0;i<s.length();i++) {
//			str = s.charAt(i)+str;
//		}
//		System.out.println(str);
//	}
//}

public class Simple1 {// html css java
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = scan.nextLine();
		String str = "";
		String s1[] = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			str = s1[i] + " " + str;
		}
		System.out.println(str);
	}
}
