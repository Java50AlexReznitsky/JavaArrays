package telran.arrays;

public class MatricesInt {
	public static int[][] multiplyConstant(int[][] matrix, int constant) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= constant;
			}
		}
		return matrix;
	}

	public static int[] getColumn(int[][] src, int column) {
		int[] arr = new int[src.length];
		for (int i = 0; i < src.length; i++) {
			arr[i] = src[i][column];
		}
		return arr;
	}

	public static int[][] transpMatrix(int[][] matrix) {
		int[][] transp = new int[matrix[0].length][matrix.length];
		for (int col = 0; col < matrix[0].length; col++) {
			for (int row = 0; row < matrix.length; row++) {
				transp[col][row] = matrix[row][col];
			}
		}
		return transp;
	}
}
