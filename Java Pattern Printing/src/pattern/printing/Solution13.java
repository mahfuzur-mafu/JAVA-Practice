package pattern.printing;

import java.util.Scanner;

public class Solution13 {
	public static void main(String args[]) {

	   int i,j,spc,k,t=1,n;  
	   Scanner sc = new Scanner(System.in);
	    n =sc.nextInt();
	   spc=n+4-1;
	   for(i=1;i<=n;i++)
	   {
	         for(k=spc;k>=1;k--)
	            {
	              System.out.print(" ");
	            }
		   for(j=1;j<=i;j++)
		   System.out.print(t++ + " ");
		System.out.println();
	    spc--;
	   }
}
}
