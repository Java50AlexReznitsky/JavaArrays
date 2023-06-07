package telran.arrays;

public class InterviewTasks {

//  complexity O[N^2]
	public static boolean isSumTwo_Slow(short[] array, short sum) {
		// array of positive numbers or 0
		// {1,2,3,4,6,7,8,9,10,12,13,14,15} sum =4
		boolean res = false;
		int i = 0;
		while (i < array.length && !res) {
			short num = (short) (sum - array[i]);
			int j = i + 1;
			while (j < array.length && !res) {
				if (array[j] == num) {
					res = true;
				}
				j++;
			}
			i++;
		}
		return res;
	}

//  complexity O[N]                                             4
	public static boolean isSumTwo_Faster(short[] array, short sum) {
		// array of positive numbers or 0
		// 0 1 2 3
		// {1,2,3,4} sum =4
		// 0 1 2 3 4
		// helper = {false,true,true false,true}
		boolean[] helper = new boolean[sum > 0 ? sum + 1 : Short.MAX_VALUE + 1];
		boolean res = false;
		int index = 0;
		while (index < array.length && !res) {
			short num = (short) (sum - array[index]);// 3,2,1,0
			if (num >= 0) {
				if (helper[num]) {
					res = true;
				} else {// 1,2,4
					helper[array[index]] = true;
				}
			}
			index++;
		}
		return res;
	}

// is not working if there are two equal numbers in array
	public static void sort(short[] array) {
		boolean[] helper = new boolean[Short.MAX_VALUE];
		for (int i = 0; i < array.length; i++) {
			helper[array[i]] = true;
		}
		short temp = 0;
		for (short i = 0; i < array.length; i++) {
			if (helper[i]) {
				array[temp] = i;
				temp++;
			}
		}
	}

	public static short getMaxWithNegativePresentation(short[] array) {
		// TODO with helper
		// returns maximum positive number having an negative value with same abs value,
		// if not such numbers, return -1
		return 0;
	}
}
