package Pattern.Pattern3;

import java.util.Scanner;

public class Pattern3 {

public static void main(String[] args) {
/*
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 

*/	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the no of lines you want to print :");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
