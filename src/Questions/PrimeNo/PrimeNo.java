package Questions.PrimeNo;

public class PrimeNo {

	public static void main(String[] args) {
		
		System.out.println(isPrime(21));
	}

	private static boolean isPrime(int n) {
		
		if(n<1)
		{
			return false;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
		
	}
}
