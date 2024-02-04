package Pattern.Pattern2;

import java.util.Scanner;

public class Pattern2 {

/*
	A 
	A B 
	A B C 
	A B C D 
	A B C D E
	
*/
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the no of lines you want to print :");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
