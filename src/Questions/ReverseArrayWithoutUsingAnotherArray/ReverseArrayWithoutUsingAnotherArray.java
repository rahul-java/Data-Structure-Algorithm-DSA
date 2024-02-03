package Questions.ReverseArrayWithoutUsingAnotherArray;

import java.util.Arrays;

public class ReverseArrayWithoutUsingAnotherArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70};
		
		System.out.println("Before : "+Arrays.toString(arr));  //Before : [10, 20, 30, 40, 50, 60, 70]
		
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		System.out.println("After : "+Arrays.toString(arr));  //After : [70, 60, 50, 40, 30, 20, 10]
	}
}
