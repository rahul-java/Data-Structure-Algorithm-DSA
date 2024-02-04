package Questions.SquareRoot;

public class SquareRoot {
	
	public static void main(String[] args) {
		int n=169;
		int squareRoot = squareRoot(n,1,n/2);
		System.out.println("Square Root of "+n+" is :"+squareRoot);
	}

	private static int squareRoot(int n, int i, int j) {

		if(n==0)
			return 0;
		
		int mid=0;
		while(i<j)
		{
			mid=(i+j)/2;
			if(mid*mid==n)
				return mid;
			if(mid*mid<n)
				i = mid+1;
			else
				j = mid-1;
		}
		return mid-1;
	}

}
