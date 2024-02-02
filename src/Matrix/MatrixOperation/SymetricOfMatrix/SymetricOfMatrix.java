package Matrix.MatrixOperation.SymetricOfMatrix;

public class SymetricOfMatrix {

	public static void main(String[] args) {

		int a[][] = { { 1, 1, 1},{ 1, 1, 1},{ 1, 1, 1} }; // size : 3*3

		if(isSymetric(a))
			System.out.println("It is Symetric");
		else
			System.out.println("Not-Symetric");
	}

	private static boolean isSymetric(int[][] a) {
		
		int rows =a.length;
		int columns=a[0].length;
		
		if(rows!=columns)
		{
			return false;
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(a[i][j]!=a[j][i])
					return false;
			}
		}
		return true;
	}
}
