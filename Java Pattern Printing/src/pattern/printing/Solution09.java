package pattern.printing;

import java.util.Scanner;

public class Solution09 {
	public static void main(String arys[]) {
		int i,j,in;
		Scanner n =new Scanner(System.in);
		in=n.nextInt();
		
		for(i=1;i<=in;i++)
		{
	
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
