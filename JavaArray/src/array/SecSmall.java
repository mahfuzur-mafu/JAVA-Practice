package array;

public class SecSmall {

	public static void main(String Args[]) {
		int arr[] = { 12, 345, 2, 6, 7896 };
		int smallest = 0, secondsmallest = 0;
		for (int i = 0; i < arr.length; i++) {
			 
			for (i = 0; i < arr.length; i++)

				if (arr[0] < arr[1]) {
					smallest = arr[0];
					secondsmallest = arr[1];
				} else {
					smallest = arr[1];
					secondsmallest = arr[0];
				}
			
			for (i = 2; i < arr.length; i++) {
				if (arr[i] < smallest) {
					secondsmallest = smallest;
					smallest = arr[i];
				} else if (arr[i] < secondsmallest) {
					secondsmallest = arr[i];
				}
			}

		}
		 System.out.println(secondsmallest);
	}
}
