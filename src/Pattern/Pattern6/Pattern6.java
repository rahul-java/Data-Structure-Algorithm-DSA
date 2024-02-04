package Pattern.Pattern6;

import java.util.Scanner;

public class Pattern6 {

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
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
