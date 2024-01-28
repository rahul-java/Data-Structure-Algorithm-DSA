package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int arr[]= {35,5,7,45,60,4};
		bubbleSort(arr);
		
		Arrays.stream(arr).forEach(i->System.out.print(i+" "));
	}

	private static void bubbleSort(int[] a) {
		
		for(int i=0;i<a.length-1;i++)
		{
			boolean isSortedArray=true;
			
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					isSortedArray=false;
				}
			}
			if(isSortedArray)
				break;
		}
	}

}
