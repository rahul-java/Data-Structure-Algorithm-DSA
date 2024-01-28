package Sorting.TwoWayMerge;

import java.util.Arrays;

public class TwoWayMerge {

	//pre-requisite : 2 sorted array
	//these 2 array merged to new array which must be sorted
	
	public static void main(String[] args) {
		
		int[] a= {5,10,11,13};
		int[] b= {2,3,8,15,17,21};
		
		int[] merge = twoWayMerge(a,b);
		
		Arrays.stream(merge).forEach(i->System.out.print(i+", "));
	}

	private static int[] twoWayMerge(int[] a, int[] b) {
		
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]>b[j])
			{
				c[k]=b[j];
				j++;
			}
			else {
				c[k]=a[i];
				i++;
			}
			k++;
		}
		
		while(j<b.length)
		{
			c[k]=b[j];
			j++;
			k++;
		}
		
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		
		return c;
	}
}
