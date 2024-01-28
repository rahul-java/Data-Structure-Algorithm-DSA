package Sorting.QuickSort.LomutoPartion;

import java.util.Arrays;

public class QuickSort {
	
	public static int c=0;

	public static void main(String[] args) {
		
		int a[]= {5, 2, 9, 1, 5, 6};
		
		System.out.println("Before : "+Arrays.toString(a));
		
		quickSort(a,0,a.length-1);
		
		System.out.println("After : "+Arrays.toString(a));
		
        System.out.println("Count "+c);
	}

	private static void quickSort(int[] a, int l, int h) {
		c++;
		if(l<h)
		{
			int partitionIndex=partition(a, l, h);
			quickSort(a, l, partitionIndex-1);
			quickSort(a, partitionIndex+1, h);
		}
	}

	private static int partition(int[] a, int l, int h) {

		int pivot=a[h];
		int i=l-1;
		
		for(int j=l;j<h;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		
		int temp1=a[i+1];
		a[i+1]=a[h];
		a[h]=temp1;
		
		return i+1;
	}
}
