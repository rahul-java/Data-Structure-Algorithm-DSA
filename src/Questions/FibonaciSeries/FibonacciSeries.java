package Questions.FibonaciSeries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {

	static int count=0;
	static int countDynamic=0;
	static int sum=0;
	static Map<String, Integer> map = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		
		/*
		//if you want to print whole series 
		int n=8;
		System.out.println("Fibonacci Series upto "+n+" terms :");
		for(int i=0;i<n;i++)
		{
			System.out.print(fibonaci(i)+" ");
		}
		System.out.println();
		System.out.println("Count : "+count);
		
		*/
		
		System.out.println("Fibonacci : "+fibonaci(8));  //Fibonacci : 21
		System.out.println("Count : "+count);            //Count : 67
		
		System.out.println("Fibonacci : "+fibonaciDynamic(8));  //Fibonacci : 21
		System.out.println("Dynamic Count : "+countDynamic);  //Dynamic Count : 15
		
	}

	private static int fibonaciDynamic(int n) {

		countDynamic++;
		
		if(map.containsKey("fiboDynamic "+n))
		{
			return map.get("fiboDynamic "+n);
		}
		
		if(n==0 || n==1)  //if(n<=1)
		{
			map.put("fiboDynamic "+n, n);
			return n;
		}
		else
		{
			sum=fibonaciDynamic(n-1)+fibonaciDynamic(n-2);
			map.put("fiboDynamic "+n, sum);
			return sum;
		}
	}

	private static int fibonaci(int n) {

		count++;
		
		if(n<=1)  //if(n==0 || n==1)
			return n;
		else
			return fibonaci(n-1)+fibonaci(n-2);	
	}
	
	

}
