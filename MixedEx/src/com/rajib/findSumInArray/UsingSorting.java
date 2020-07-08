/**
 * Find pair with given sum in an array.
 * using sorting. time complexity O(nlog(n)), space O(1).
 */
package com.rajib.findSumInArray;

import java.util.Arrays;

/**
 * @author rajib
 *
 */
public class UsingSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int array[] = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		findPair(array, sum);
	}

	public static void findPair(int arr[], int sum) {

		Arrays.sort(arr);

		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			if (arr[low] + arr[high] == sum) {
				System.out.printf("Pair found at %d and %d (%d + %d)\n", low, high, arr[low], arr[high]);
			}

			if (arr[low] + arr[high] < sum) {
				low++;
			} else {
				high--;
			}
		}
	}

}
