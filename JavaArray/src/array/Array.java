package array;

public class Array {
	public static void main(String Args[]) {
		 int arr[] ={12,345,2,6,7896 }; 
		 for( int i=0;i<arr.length;i++){ 
			 if(arr[i]%2==0) {
				 int count=0;
				 while(arr[i]!=0)  
				   {  
				       arr[i]=arr[i]/10;  
				       count++;  
				   } 
			 System.out.println("even " + count );
			 }	 
			 else { 
				 int count=0;
				 while(arr[i]!=0)  
				   {  
				       arr[i]=arr[i]/10;  
				       count++;  
				   } 
				 System.out.println("odd " +count);  
			 }
			 
			 }  
			 
	 }

}



