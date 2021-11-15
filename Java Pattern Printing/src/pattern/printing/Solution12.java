package pattern.printing;

import java.util.Scanner;

public class Solution12 {
	public static void main(String arys[]) {
		int i,j,in,m=1;
		Scanner n =new Scanner(System.in);
		in=n.nextInt();
		
		for(i=1;i<=in;i++)
		{
	
			for(j=1;j<=i;j++)
			{
				System.out.print(m++ +" ");
			}
			System.out.println("");
		}
	}

}
