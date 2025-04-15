package CodingQuestions;

public class EvenSquare {

	 public static void main(String[]args) {
		 
		 int[] arr = {1,2,3,4};
		 int count=0;
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 if(arr[i]%2==0) {
				 count++;
			 }
		 }
		 
		 int[] arr1 = new int[count];
		 int index=0;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
				 arr1[index] = arr[i]*arr[i];
				 index++;
			 }
		 }
		 
		 for(int i=0;i<arr1.length;i++) {
			 System.out.print(arr1[i]+" ");
		 }
	 }
}
