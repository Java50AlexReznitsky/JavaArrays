package telran.arrays;

public class InterviewTasks {

//  complexity O[N^2]
	public static boolean isSumTwo_Slow(short[] array, short sum) {
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

//  complexity O[N]
	public static boolean isSumTwo_Faster(short[] array, short sum) {
		// array of positive numbers or 0
		// {1,2,3,4} sum =4
		// helper = {false,false,false false,false}
		boolean[] helper = new boolean[sum > 0 ? sum + 1 : Short.MAX_VALUE + 1];
		boolean res = false;
		int index = 0;
		while (index < array.length && !res) {
			short num = (short) (sum - array[index]);
			if (num >= 0) {
				if (helper[num]) {
					res = true;
				} else {
					helper[array[index]] = true;
				}
			}
			index++;
		}
		return res;
	}

	public static void sort(short[] array) {
		// TODO with helper
		// array of positive or 0 numbers
		// sorting with complexity O[N]
	}

	public static short getMaxWithNegativePresentation(short[] array) {
		// TODO with helper
		// returns maximum positive number having an negative value with same abs value,
		// if not such numbers, return -1
		return 0;
	}
}
