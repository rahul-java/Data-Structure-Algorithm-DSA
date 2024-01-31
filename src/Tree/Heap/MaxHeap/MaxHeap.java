package Tree.Heap.MaxHeap;

import java.util.Arrays;

//Convert the given array into max heap.

public class MaxHeap {

	public static void main(String[] args) {
		
		int[] arr= {5,15,9,21,1,6,5};
		System.out.println("Before   ::: "+Arrays.toString(arr)); //Before   ::: [5, 15, 9, 21, 1, 6, 5]
		maxHeap(arr);
	}

	private static void maxHeap(int[] arr) {

		int n=arr.length;
		
		for(int i=n/2-1;i>=0;i--)
			heapify(i,arr,n);
		
		System.out.println("MaxHeap  ::: "+Arrays.toString(arr));  //MaxHeap  ::: [21, 15, 9, 5, 1, 6, 5]
	}

	private static void heapify(int i, int[] arr, int length) {
		
		int parentPosition=i;
		int leftChild=2*i+1;
		int rightChild=2*i+2;
		
		if(leftChild<length && arr[parentPosition]<arr[leftChild])
		{
			parentPosition=leftChild;
		}
		
		if(rightChild<length && arr[parentPosition]<arr[rightChild])
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
