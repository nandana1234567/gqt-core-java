package patterns;

import java.util.Scanner;

public class Pattern39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		
		 for (int i = 1; i <= n; i++) {
	            
	            for (int s = 1; s <= n - i; s++) {
	                System.out.print("  ");
	            }

	           
	            for (int j = 0; j < i; j++) {
	                System.out.print((char) ('A' + j) + " ");
	            }

	            
	            for (int j = 0; j < i - 1; j++) {
	                System.out.print((char) ('A' + j) + " ");
	            }

	            System.out.println();
	        }

	}

}
