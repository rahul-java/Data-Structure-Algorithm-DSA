package Matrix.MatrixOperation.MultiplicationOfMatrix;

public class MultiplicationOfMatrix {

	// pre-requisie : column of first matrix must matches with rows of second
	// matrix.

	public static void main(String[] args) {

		int a[][] = { { 1, 3, 5, 7 }, { 9, 11, 13, 15 } }; // size : 2*4
		int b[][] = { { 2, 4, 6, 8 }, { 3, 5, 7, 9 }, { 10, 12, 14, 16 }, { 17, 19, 21, 23 } }; // size : 4*3
		
		try {

			multiplyMatrix(a, b);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	private static void multiplyMatrix(int[][] a, int[][] b) throws Exception {

		int c[][] = null;

		if (a != null && b != null) {
			int rows = a.length;
			int columns = b[0].length;

			if (a[0].length == b.length) {
				c = new int[rows][columns];

				for (int i = 0; i < rows; i++) {
					int sum = 0;
					for (int j = 0; j < columns; j++) {
						for (int k = 0; k < rows; k++) {
							sum += a[i][k] * b[k][j];
						}
						c[i][j] = sum;
					}
				}

				System.out.println("================Printing Multiplication of Matrix================");

				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < columns; j++) {
						System.out.print(" " + c[i][j]);

					}
					System.out.println();
				}

			} else {
				throw new Exception(
						"Matrix Multiplication is not possible as the a->columns and b->rows are not same...");
			}
		}
	}

}
