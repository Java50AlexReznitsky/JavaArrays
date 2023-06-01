package telran.arrays.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.arrays.ArraysInt;

public class ArraysTest {
	@Test
	void initialTest() {
		int[] ar1 = { 1, 2, 3 };
		int[] ar2 = { 1, 2, 3 };
		int[] ar2_3 = ar2;
		assertFalse(ar1 == ar2);
		assertTrue(ar2 == ar2_3);
		assertArrayEquals(ar1, ar2);
		ar2_3[0] = 10;
		ar1[0] = 10;
		// assertArrayEquals(ar1, ar2); wrong test
	}

	@Test
	void copyOfIntTest() {
		int[] ar1 = { 10, 5, 15 };
		int[] expected1 = { 10, 5, 15 };
		int[] expected2 = { 10, 5 };
		int[] expected3 = { 10, 5, 15, 0, 0 };
		assertArrayEquals(expected1, Arrays.copyOf(ar1, 3));
		assertArrayEquals(expected2, Arrays.copyOf(ar1, 2));
		assertArrayEquals(expected3, Arrays.copyOf(ar1, 5));
	}

	@Test
	void addNumberTest() {
		int[] ar1 = { 10, 5, 15 };
		int number = 20;
		int[] expected = { 10, 5, 15, number };
		assertArrayEquals(expected, ArraysInt.addNumber(ar1, number));
	}

	@Test
	void arrayCopyTest() {
		int[] src = { 1, 2, 3, 4, 5, 6, 7 };
		int[] dest = { 10, 20, 30, 40, 50, 60, 70 };
		int[] expected = { 10, 20, 30, 40, 1, 2, 3 };
		System.arraycopy(src, 0, dest, 4, 3);
		assertArrayEquals(expected, dest);
	}

	@Test
	void insertNumberTest() {
		int[] src = { 1, 2, 3, 4, 5, 6, 7 };
		int number = 20;
		int index = 3;
		int[] expected1 = { 1, 2, 3, 20, 4, 5, 6, 7 };
		assertArrayEquals(expected1, ArraysInt.insertNumber(src, index, number));
		number = 30;
		index = 0;
		int[] expected2 = { 30, 1, 2, 3, 4, 5, 6, 7 };
		assertArrayEquals(expected2, ArraysInt.insertNumber(src, index, number));
		number = 40;
		index = 7;
		int[] expected3 = { 1, 2, 3, 4, 5, 6, 7, 40 };
		assertArrayEquals(expected3, ArraysInt.insertNumber(src, index, number));

	}

	@Test
	void removeNumberTest() {
		int[] array = { 1, 3, 7, 9, 11 };
		int[] expected1 = { 1, 3, 7, 11 };
		int index1 = 3;
		assertArrayEquals(expected1, ArraysInt.removeNumber(array, index1));
		int[] expected2 = { 3, 7, 9, 11 };
		int index2 = 0;
		assertArrayEquals(expected2, ArraysInt.removeNumber(array, index2));
		int[] expected3 = { 1, 3, 7, 9 };
		int index3 = 4;
		assertArrayEquals(expected3, ArraysInt.removeNumber(array, index3));
	}

	@Test
	void binarySearchTest() {
		int[] sortedArr = { 1, 3, 7, 9, 11 };
		assertEquals(-3, Arrays.binarySearch(sortedArr, 5));
		assertEquals(0, Arrays.binarySearch(sortedArr, 1));
		assertEquals(2, Arrays.binarySearch(sortedArr, 7));
		assertEquals(sortedArr.length - 1, Arrays.binarySearch(sortedArr, 11));
		assertEquals((-(sortedArr.length) - 1), Arrays.binarySearch(sortedArr, 12));
	}

	@Test
	void insertNumberSortedTest() {
		int[] sortedArr = { 1, 3, 7, 9, 11 };

		int[] expectedArr = { 1, 1, 3, 7, 9, 11 };
		assertArrayEquals(expectedArr, ArraysInt.insertNumberSorted(sortedArr, 1));

		int[] expectedArr1 = { 1, 2, 3, 7, 9, 11 };
		assertArrayEquals(expectedArr1, ArraysInt.insertNumberSorted(sortedArr, 2));

		int[] expectedArr2 = { 1, 3, 7, 9, 11, 12 };
		assertArrayEquals(expectedArr2, ArraysInt.insertNumberSorted(sortedArr, 12));

		int[] expectedArr3 = { 0, 1, 3, 7, 9, 11 };
		assertArrayEquals(expectedArr3, ArraysInt.insertNumberSorted(sortedArr, 0));

		int[] expectedArr4 = { -15, 1, 3, 7, 9, 11 };
		assertArrayEquals(expectedArr4, ArraysInt.insertNumberSorted(sortedArr, -15));

	}
}
