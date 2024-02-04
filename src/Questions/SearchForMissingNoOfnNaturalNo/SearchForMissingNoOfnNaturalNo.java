package Questions.SearchForMissingNoOfnNaturalNo;

public class SearchForMissingNoOfnNaturalNo {

	public static void main(String[] args) {
		
		int a[]= {1,4,3,5,6,7,8};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int sumOfNaturalNo=sumOfNaturalNo(a.length+1);
		int missingNo=sumOfNaturalNo-sum;
		System.out.println(missingNo);
	}

	private static int sumOfNaturalNo(int n) {

		return (n*(n+1))/2;
	}
}
