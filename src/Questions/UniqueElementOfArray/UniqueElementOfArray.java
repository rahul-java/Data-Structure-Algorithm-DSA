package Questions.UniqueElementOfArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElementOfArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,1,2,3,10,12,14,1,2,3};
		
		//Using Set<>
		System.out.println("===============By Using Set<>================");
		findUniqueAndDuplicateByUsingSet(a);
		
		//Without Using Set<>
		System.out.println("===============Without Using Set<>=========================");
		findUniqueAndDuplicateWithoutUsingSet(a);
	}

	private static void findUniqueAndDuplicateWithoutUsingSet(int[] a) {

		System.out.println("Original Array : "+Arrays.toString(a));
		
		int[] unique=new int[a.length];
		int[] duplicate=new int[a.length];
		int k=0,l=0;
		
		for(int i=0;i<a.length;i++)
		{
			boolean duplicateElementFound=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					duplicateElementFound=true;
					break;
				}
			}
			
			if(!duplicateElementFound)
			{
				unique[k]=a[i];
				k++;
			}
			else
			{
				duplicate[l]=a[i];
				l++;
			}
		}
		unique = Arrays.copyOf(unique, k);
		duplicate = Arrays.copyOf(duplicate, l);
		
		System.out.println("Unique Element     : "+Arrays.toString(unique));
		System.out.println("Duplicate Elements : "+Arrays.toString(duplicate));
	}

	private static void findUniqueAndDuplicateByUsingSet(int[] a) {
		
		System.out.println("Original Array : "+Arrays.toString(a));
		Set<Integer> unique=new HashSet<Integer>();
		Set<Integer> duplicate=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!unique.contains(a[i]))
				unique.add(a[i]);
			else 
				duplicate.add(a[i]);
			
		}
		
		System.out.println("Unique Element : "+unique);
		System.out.println("Duplicate Elements : "+duplicate);
		
		
	}
}
