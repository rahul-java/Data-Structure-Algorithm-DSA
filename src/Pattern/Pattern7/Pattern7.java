package Pattern.Pattern7;

import java.util.Scanner;

public class Pattern7 {

	/*
	* * * * * 
	* * * * 
	* * * 
	* * 
	* 
	 */
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the no of lines you want to print :");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
