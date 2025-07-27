package patterns;

import java.util.Scanner;

public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		 char ch = 'A';

	        for (int i = 1; i <= n; i++) {
	            
	            for (int s = 1; s <= n - i; s++) {
	                System.out.print("  ");
	            }

	           
	            char start = (char) (ch + 2 * (i - 1));

	            
	            for (char c = start; c >= 'A'; c--) {
	                System.out.print(c + " ");
	            }

	            System.out.println();
	        }

}
}
