package telran.arrays.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import telran.arrays.MatricesInt;

class MatricesTest2 {

	@Test
	void multiplyConstantTest() {
		int[][] src = { { 1, 10, 20 }, { 30, -10, 15 } };
		int[][] expected = { { 2, 20, 40 }, { 60, -20, 30 } };
		assertArrayEquals(expected, MatricesInt.multiplyConstant(src, 2));
	}

	@Test
	void getColumnTest() {
		int[][] src = { { 1, 10, 20 }, { 30, -10, 15 } };
		int[] expected = { 1, 30 };
		assertArrayEquals(expected, MatricesInt.getColumn(src, 0));
	}

	@Test
	void transpMatrixTest() {
		int[][] src = { { 1, 10, 20 }, { 30, -10, 15 } };
		int[][] expected = { { 1, 30 }, { 10, -10 }, { 20, 15 } };
		assertArrayEquals(expected, MatricesInt.transpMatrix(src));
	}

}
