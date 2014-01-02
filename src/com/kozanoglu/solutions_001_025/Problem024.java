package com.kozanoglu.solutions_001_025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem024 {


	public static void main(String[] args) {

		/*
		* It can be resolved using the Factoradic number system. We can represent the 1000000th permutation with the 
		 * corresponding Factoradic number, then we just have to get the numbers from 0 to 9 with the index given as 
		 * the digits of the Factoradic number.
		 * Exemple of Factoradic numbers: 
		 *  F(0) = 0x9! + 0x8! + 0x7! + 0x6! + 0x5! + 0x4! + 0x3! + 0x2! + 0x1! + 0x0! (=> 0 1 2 3 4 5 6 7 8 9)
		 *  F(1) = 0x9! + 0x8! + 0x7! + 0x6! + 0x5! + 0x4! + 0x3! + 0x2! + 1x1! + 0x0! (=> 0 1 2 3 4 5 6 7 9 8)
		 *  F(1440) = 0x9! + 0x8! + 0x7! + 2x6! + 0x5! + 0x4! + 0x3! + 0x2! + 0x1! + 0x0! (=> 0 1 2 3 6 4 5 7 9 8)
		 *  So we first define the base: 
		 *  We want the 1000000th permutation, so we have to compute F(999999) since Factoradic number are from 0 to N-1. 
		 *  Once we have the digits of the number, we can use them to retrieve the permutation by using the digits as indexes 
		 *  to get the digits from 0 to 9 in the same order they are given.*
		 */
		final int BASE = 10;
		 
		// the base (9!, 8!, 7!, ...)
		int[] base = {362880, 40320, 5040, 720, 120, 24, 6, 2, 1, 1};
		System.out.println(Arrays.toString(base));
		// find the digits of the Factoradic number for 999999
		int[] digits = new int[BASE];
		int n = 999999;
		for (int i = BASE - 1; i >= 0; i--) {
		int remain = n % base[BASE - 1 - i];
		digits[BASE - 1 - i] = (n - remain) / base[BASE - 1 - i];
		n = remain;
		}
		System.out.println("F(999999): " + Arrays.toString(digits));
		// now, that we have the index of the permuted numbers, we display these numbers:
		List<Integer> numbers = new ArrayList<Integer>(BASE);
		for (int i = 0; i < BASE; i++) 
		numbers.add(i);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < digits.length; i++) 
		sb.append(numbers.remove(digits[i]));
		System.out.println("1000000th permutation is " + sb);
	

	}

}
