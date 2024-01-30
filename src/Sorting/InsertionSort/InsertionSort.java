package Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
	
public static void main(String[] args) {
		
		int arr[]= {14,5,1,2,15,6,16,4,9,8,7};
		
		System.out.println("Before : "+Arrays.toString(arr));
		
		insertionSort(arr);
		
		System.out.println("After : "+Arrays.toString(arr));
		
	}

private static void insertionSort(int[] arr) {

	for(int i=0;i<arr.length;i++)
	{
		int key=arr[i];
		int j=i-1;
		
		while(j>=0 && arr[j]>key)
		{
			arr[j+1]=arr[j];
			j--;
		}
		
		arr[j+1]=key;
	}
}

}
