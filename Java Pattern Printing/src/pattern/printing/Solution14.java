package pattern.printing;

import java.util.Scanner;

public class Solution14 {
	public static void main(String args[]) {

		int i, j,n;
	    Scanner sc = new Scanner(System.in);
	    n =sc.nextInt();
		for (i = 0; i < n; i++) {
	
			for (j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
			
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
