package Questions.SumOfnNaturalNos;

public class SumOfnNaturalNos {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int n=arr.length;
		int sum1=(n*(n+1))/2;
		
		System.out.println("Sum of "+n+" natural Nos is : "+sum1);
		
		int sum2=0;
		for(int i=0;i<arr.length;i++)
			sum2+=arr[i];
		
		System.out.println("Sum of "+n+" natural Nos is : "+sum2);
	}
}
