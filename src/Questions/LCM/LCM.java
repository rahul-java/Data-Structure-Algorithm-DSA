package Questions.LCM;

public class LCM {

	//Least Common Factor
	
	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,15,35};
		
		long lcm=lcm(arr);
		
		System.out.println("LCM : "+lcm);
	}

	private static long lcm(int[] arr) {

		int divisor=2;
		long lcm=1;
		boolean isDivisible;
		int count;
		
		while(true)
		{
			count=0;
			isDivisible=false;
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==0)
				{
					return 0;
				}
				
				if(arr[i]==1)
				{
					count++;
				}
				
				if(arr[i]%divisor==0)
				{
					isDivisible=true;
					arr[i]=arr[i]/divisor;
				}				
			}
			if(isDivisible)
			{
				lcm=lcm*divisor;
			}
			else
			{
				divisor++;
			}
			
			if(count==arr.length)
			{
				return lcm;
			}
		}
		
	}
}
