/**
 * Find pair with given sum in an array.
 * simple solution with nested loop. time complexity O(n^2), space O(1).
 */
package com.rajib.findSumInArray;

/**
 * @author rajib
 *
 */
public class NestedLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int array[] = { 8, 7, 2, 5, 3, 1 };

		for (int i = 0; i < array.length - 1; ++i) {

			for (int j = i + 1; j < array.length; ++j) {
				if (array[i] + array[j] == 10) {
					System.out.printf("Pair found at index %d and %d (%d + %d)\n", i, j, array[i], array[j]);
				}
			}
		}
	}

}
