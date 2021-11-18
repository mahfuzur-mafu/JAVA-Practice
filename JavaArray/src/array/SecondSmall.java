package array;

import java.util.Arrays;

public class SecondSmall {
	public static void main(String Args[]) {
		 int arr[] ={12,345,2,6,7896 }; 
		
		 int smallest= Integer.MAX_VALUE;
		 int secl=Integer.MAX_VALUE;
		 
		 for (int i = 0; i < arr.length; i++)   
		 {       
		 if(arr[i]< smallest) {
			 secl=smallest;
			 smallest=arr[i];
		 }
		 
		 else if(arr[i]< secl && arr[i]>smallest)
		 {
			 secl=arr[i];
		 }
		 
		 }   
		 System.out.println(secl);

}

}