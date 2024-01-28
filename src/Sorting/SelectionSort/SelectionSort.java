package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {35,5,100,7,45,60,4};
		selectionSort(arr);
		
		Arrays.stream(arr).forEach(i->System.out.print(i+" "));
	}

	private static void selectionSort(int[] a) {
		
		int minIndex,temp;
		
		for(int i=0;i<a.length-1;i++)
		{
			minIndex=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[minIndex]>a[j])
				{
					minIndex=j;
				}
			}
			
			temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
		
	}
}
