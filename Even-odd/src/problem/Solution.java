package problem;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {

		int num, i;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if (num == 0) {
			System.out.println("This is zero");
		} 
		for (i = 1; i <= num; i++) {
		
				if (i % 2 == 0)
					System.out.println("even: "+i);
				else
					System.out.println("odd: "+i);
			}
		}

	}


