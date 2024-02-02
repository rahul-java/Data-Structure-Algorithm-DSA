package Matrix.MatrixOperation.AdditionOfMatrix;

public class AdditionOfMatrix {

	//pre-requisite Both the array must be of same size.
	
	public static void main(String[] args) {
		
		int a[][]= {{1,3,5,7},{9,11,13,15},{17,19,21,23}}; //size : 3*4
		int b[][]= {{2,4,6,8},{3,5,7,9},{10,12,14,16}};  //size : 3*4
		
		try {
			
			addMatrix(a,b);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	private static void addMatrix(int[][] a, int[][] b) throws Exception {

		if(a!=null && b!=null)
		{
			int rows=a.length;
			int columns=a[0].length;
			
			if((a.length==b.length) && (a[0].length==b[0].length))
			{
				int c[][]=new int[rows][columns];
				
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{
						c[i][j]=a[i][j]+b[i][j];
					}
				}
				
				System.out.println("================Printing Addition of Matrix================");
				
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{
						System.out.print(" "+c[i][j]);
						
					}
					System.out.println();
				}
				
				
			}
			else
			{
			   throw new Exception("Matrix Addition is not possible as the rows and columns are not same...");	
			}
		}
	}
}
