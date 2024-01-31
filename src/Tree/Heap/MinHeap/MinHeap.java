package Tree.Heap.MinHeap;

import java.util.Arrays;

//Convert the given array into min heap.
public class MinHeap {
	
public static void main(String[] args) {
		
		int[] arr= {5,15,9,21,1,6,50};
		System.out.println("Before   ::: "+Arrays.toString(arr));  //Before   ::: [5, 15, 9, 21, 1, 6, 50]
		minHeap(arr);
	}

	private static void minHeap(int[] arr) {

		int n=arr.length;
		
		for(int i=n/2-1;i>=0;i--)
			heapify(i,arr,n);
		
		System.out.println("MinHeap  ::: "+Arrays.toString(arr));  //MinHeap  ::: [1, 5, 6, 21, 15, 9, 50]
	}

	private static void heapify(int i, int[] arr, int length) {
		
		int parentPosition=i;
		int leftChild=2*i+1;
		int rightChild=2*i+2;
		
		if(leftChild<length && arr[parentPosition]>arr[leftChild])
		{
			parentPosition=leftChild;
		}
		
		if(rightChild<length && arr[parentPosition]>arr[rightChild])
		{
			parentPosition=rightChild;
		}
		
		if(parentPosition!=i)
		{
			int temp=arr[i];
			arr[i]=arr[parentPosition];
			arr[parentPosition]=temp;
			
			heapify(parentPosition, arr, length);
		}
		
	}

}
