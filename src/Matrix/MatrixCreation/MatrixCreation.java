package Matrix.MatrixCreation;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixCreation {
	
	public static void main(String[] args) {
		
		//initialization of matrix
		//int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of Columns : ");
		int columns = sc.nextInt();
		
		int[][] arr=new int[rows][columns];
		
		int totalNoOfElements=rows*columns;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println("Please Enter the data for arr["+i+"]["+j+"]: ");
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println("================Printing Matrix================");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(" "+arr[i][j]);
				
			}
			System.out.println();
		}
		
	}

	

}
