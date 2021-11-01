import java.util.Scanner;

public class JavaPractice {
	 public static void main(String[] args) {
	        /* Read input */
	        Scanner scan = new Scanner(System.in);
	        int i    = scan.nextInt();
	        double d = scan.nextDouble();
	        scan.nextLine();              
	        String str = scan.nextLine();
	        scan.close();
	        
	        /* Print output */
	        System.out.println("String: " + str);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }
}


