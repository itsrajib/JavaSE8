/**
 * Find pair with given sum in an array.
 * using HashMap. time complexity O(n), space O(1).
 */
package com.rajib.findSumPair;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rajib
 *
 */
public class UsingHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int array[] = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		findPair(array, sum);
	}

	public static void findPair(int arr[], int sum) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; ++i) {

			if (map.containsKey(sum - arr[i])) {
				System.out.printf("Pair found at %d and %d (%d + %d)\n", map.get(sum - arr[i]), i, sum - arr[i],
						arr[i]);
			} else {
				map.put(arr[i], i);// if array contains duplicate items then put this statement outside else block
			}
		}
	}

}
