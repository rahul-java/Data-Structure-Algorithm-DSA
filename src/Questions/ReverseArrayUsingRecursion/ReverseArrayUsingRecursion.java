package Questions.ReverseArrayUsingRecursion;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Before : "+Arrays.toString(a));
		
		reverseArray(a,0,a.length-1);
		
		System.out.println("After : "+Arrays.toString(a));
	}

	private static void reverseArray(int[] a, int i, int j) {

		if(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			reverseArray(a, i+1, j-1);
		}
	}

}
