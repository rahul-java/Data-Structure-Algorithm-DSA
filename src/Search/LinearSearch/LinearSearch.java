package Search.LinearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {10,9,7,3,1,15,19};
		
		int no=15;
		//search 15 using linear search
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==no)
			{
				System.out.println("Element Found at position a["+i+"] = "+a[i]);
				break;
			}
		}
	
	}
}
