package Sorting.QuickSort.HoarersPartition;

import java.util.Arrays;

public class QuickSortFirstElementAsPivot {
	
	public static void main(String[] args) {
		
		int arr[]= {14,5,1,2,15,6,16,4,9,8,7};
		
		System.out.println("Before : "+Arrays.toString(arr));
		
		quickSort(arr,0,arr.length-1);
		
		System.out.println("After : "+Arrays.toString(arr));
		
	}

	private static void quickSort(int[] arr, int l, int h) {

		if(l<h)
		{
			int partitionIndex=partition(arr, l, h);
			quickSort(arr, l, partitionIndex-1);
			quickSort(arr, partitionIndex+1, h); 
		}
	}

	private static int partition(int[] arr, int l, int h) {

		int pivot=arr[l];
		int i=l;
		int j=h;
		
		while(i<j)
		{
			i++;
			
			while(i<=h && arr[i]<pivot)
			{
				i++;
			}
			
			while(j>=l && arr[j]>pivot)
			{
				j--;
			}
			
			if(i<=h && i<j)
			{
				swap(arr,i,j);
			}
		}
		
		swap(arr,l,j);
		
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		
		if(i>=0 && j>=0 && i<arr.length && j<arr.length)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}

		
	}

}
