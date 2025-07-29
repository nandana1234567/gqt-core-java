/**
 * 
 */
package patterns;

import java.util.Scanner;

/**
 *@author USER

 * @category pattern

 * @description This is an example for number pattern
 */
public class Pattern1To9 {

	/**
	 * @param args
	 * @description This contains source code for pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0|| i==(n-1) || j==0 ||j==(n-1)) //O
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==n-1 ||j==n/2||i+j==n/2)                      
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0||j==n-1&&i<=n/2||i==n/2||j==0&&i>=n/2||i==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0||j==n-1&&i<=n/2||i==n/2||j==n-1&&i>=n/2||i==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i+j==n-1&&i<=n/2||i==n/2&&j>=n/2||j==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0||j==0&&i<=n/2||i==n/2||j==n-1&&i>=n/2||i==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n/2||j==n-1&&i>=n/2||i==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0||i+j==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0|| i==(n-1) || j==0 || j==(n-1) ||
						   i==(n/2) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0||j==0&&i<=n/2||i==n/2||j==n-1) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
	}

}
}