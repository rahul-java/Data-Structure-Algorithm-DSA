package Questions.Factorial;

public class Factorial {
	
	public static void main(String[] args) {
		
		int factorial = factorial(6);
		System.out.println("Factorial is : "+factorial);
		
		int factorialByRecursion = factorialByRecursion(6);
		System.out.println("Factorial By Using Recursion is : "+factorialByRecursion);
		
	}

	private static int factorialByRecursion(int n) {
		
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*factorialByRecursion(n-1);
		}
	}

	private static int factorial(int n) {

		int res=1;
		for(int i=2;i<=n;i++)
		{
			res=res*i;
		}
		return res;
	}

}
