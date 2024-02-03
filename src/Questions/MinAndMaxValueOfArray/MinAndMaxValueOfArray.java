package Questions.MinAndMaxValueOfArray;

import java.lang.module.FindException;

public class MinAndMaxValueOfArray {

	public static void main(String[] args) {
		
		int a[]= {31,2,5,1,32,321,80};
		int minValue=a[0];
		int maxValue=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(minValue>a[i])
				minValue=a[i];
			if(maxValue<a[i])
				maxValue=a[i];
		}
		
		System.out.println("Max : "+maxValue+"\t Min :"+minValue);
	}
}
