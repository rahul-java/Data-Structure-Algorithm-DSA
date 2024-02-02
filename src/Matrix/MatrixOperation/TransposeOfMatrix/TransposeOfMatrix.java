package Matrix.MatrixOperation.TransposeOfMatrix;

public class TransposeOfMatrix {
	
	//rows will be converted as columns and columns will be converted as rows.
	
	public static void main(String[] args) {
		
		int a[][]= {{1,3,5,7},{9,11,13,15}}; //size : 2*4
		
		System.out.println("================Before================");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
		}
		int[][] transposeOfMatrix = transposeOfMatrix(a);
		
		System.out.println("================Transpose================");
		for(int i=0;i<transposeOfMatrix.length;i++)
		{
			for(int j=0;j<transposeOfMatrix[0].length;j++)
			{
				System.out.print(" "+transposeOfMatrix[i][j]);
				
			}
			System.out.println();
		}
		
		
	}

	private static int[][] transposeOfMatrix(int[][] a) {

		int rows=a.length;
		int columns=a[0].length;
		
		int transpose[][]=new int[columns][rows];
		
		for(int i=0;i<rows*columns;i++)
		{
			int row=i%rows;
			int column=i/rows;
			transpose[column][row]=a[row][column];
		}
		
		return transpose;
	}

}
