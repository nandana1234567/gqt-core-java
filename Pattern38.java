package patterns;

import java.util.Scanner;

public class Pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
            
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  "); 
            }

           
            for (char ch = (char) ('A' + i); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            
            for (char ch = 'B'; ch <= (char) ('A' + i); ch++) {
                System.out.print(ch + " ");
            }

           
            System.out.println();
        }

	}

}
