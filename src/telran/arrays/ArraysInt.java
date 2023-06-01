package telran.arrays;

import java.util.Arrays;

public class ArraysInt {

	public static int[] addNumber(int[] array, int number) {
		int[] res = Arrays.copyOf(array, array.length + 1);
		res[array.length] = number;
		return res;
	}

	public static int[] insertNumber(int[] array, int index, int number) {
		int[] res = new int[array.length + 1];
		System.arraycopy(array, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(array, index, res, index + 1, array.length - index);
		return res;
	}

	public static int[] removeNumber(int[] array, int index) {
		int[] newArr = new int[array.length - 1];
		for (int i = 0, k = 0; i < array.length; i++) {
			if (i != index) {
				newArr[k] = array[i];
				k++;
			}
		}
		return newArr;
	}

	public static int[] insertNumberSorted(int[] arraySorted, int number) {
		int index = Arrays.binarySearch(arraySorted, number);
		int indexRes = index >= 0 ? index : (-(index) - 1);
		int[] res = insertNumber(arraySorted, indexRes, number);
		return res;
	}
}
