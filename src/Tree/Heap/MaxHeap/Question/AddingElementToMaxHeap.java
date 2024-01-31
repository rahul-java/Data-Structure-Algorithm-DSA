package Tree.Heap.MaxHeap.Question;

import java.util.Arrays;

public class AddingElementToMaxHeap {
	
	/*
	 * write a program to add a new element to MaxHeap and after addition of element the array should be MaxHeap.
	 * 
	 * */
	
	public static void main(String[] args) {
		
		int[] arr= {15,10,8,7,6,5};
		
		addElementToMaxHeap(25,arr);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void addElementToMaxHeap(int elementToBeInserted , int[] arr) {

		int b[]=Arrays.copyOf(arr, arr.length+1);
		b[b.length-1]=elementToBeInserted;
		
		int lastElementIndex=b.length-1;
		
		while(lastElementIndex>0)
		{
			int parentPositionOfLastElement=(lastElementIndex-1)/2;
			
			if(b[parentPositionOfLastElement]<b[lastElementIndex])
			{
				int temp=b[lastElementIndex];
				b[lastElementIndex]=arr[parentPositionOfLastElement];
				b[parentPositionOfLastElement]=temp;
				
				lastElementIndex=parentPositionOfLastElement;
			}
			else
			{
				break;
			}
		}
		
		System.out.println(Arrays.toString(b));
		
	}

}
