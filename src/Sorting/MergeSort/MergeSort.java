package Sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] arr= {6,5,3,18,7,24};
		
		System.out.println("Given Array : "+Arrays.toString(arr));
		
		mergeSort(arr,0,arr.length-1);
		
		System.out.println("Sorted Array : "+Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr,int l,int h) {
		
		if(l<h)
		{
			//find middle point
			int mid=(l+h)/2;
			
			//sort first and second halves
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, h);
			
			merge(arr, l, mid, h);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		
		//find sizes of two sub arrays to
		
		int n1=m-l+1;
		int n2=r-m;
		
		//create temp array
		int[] left=new int[n1];
		int[] right=new int[n2];
		
		//copy data to temp array
		
		for(int i=0;i<n1;++i)
		{
			left[i]=arr[l+i];
		}
		for(int j=0;j<n2;++j)
		{
			right[j]=arr[m+1+j];
		}
		
		//merge the temp arrays
		//initial index of first and second sub arrays
		//initial index of merged subarray
		
		int i=0,j=0;
		int k=l;
		
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else {
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
		
	}

}
