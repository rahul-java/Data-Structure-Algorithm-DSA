package Search.BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[]= {1,5,15,21,31,54,95,195};
		
		//pre-requisite array must be sorted.
		
		binarySearch(a,95);
	}

	private static void binarySearch(int[] a, int element) {

		int l=0,h=a.length-1;
		int iteration=0;
		
		while(l<h)
		{
			iteration++;
			
			int m=(l+h)/2;
			//int m=l+(h-l)/2;
			
			if(a[m]==element)
			{
				System.out.println("Element found at "+m+" position in "+iteration+" iterations");
			}
			
			if(a[m]<element)
			{
				l=m+1;
			}
			else
			{
				h=m;
			}
		}
	}
	
	/*
	 * Overflow issue
	 * l=10000;
	 * h=2147483647; //(Integer.MAX_VALUE)
	 * m=(l+h)/2; //return negative value bcoz overflow issue
	 * syso(m); //index cant be negative
	 * m=l+(h-l)/2; //this will work fine
	 * syso(m); //this will return positive value
	 * */
}
