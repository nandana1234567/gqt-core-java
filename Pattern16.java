package patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count:");
		int a=3;
		int b=4;
		int n=a*b;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if((i+j)%2==0) {
			System.out.print("1");
		}
				else{
					System.out.print("0");
				}
				}
			System.out.println();

	}

	}

}
