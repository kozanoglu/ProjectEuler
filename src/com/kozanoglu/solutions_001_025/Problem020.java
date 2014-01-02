package com.kozanoglu.solutions_001_025;

import java.math.BigInteger;

public class Problem020 {
	
	// n faktöriyeli bulan fonk.
	public static BigInteger fact(int n) {
		if (n < 2) {
			BigInteger m = BigInteger.valueOf(n);
			return m;
		}
		BigInteger m = BigInteger.valueOf(n);
		return m.multiply(fact(n - 1));
	}

	
	public static void main(String[] args) {

		long sum20 = 0;
		BigInteger n20 = BigInteger.ZERO;
		n20 = fact(100);
		String s = n20.toString();
		int[] intArray = new int[s.length()];
		 
		for (int i = 0; i < s.length(); i++) {
			intArray[i] = Character.digit(s.charAt(i), 10);  // Returns the numeric value of the character ch in the specified radix.
		}
		for (int i = 0; i < s.length() ; i++) {
			sum20 += intArray[i];
		}
		System.out.println(sum20);
		

	}

}
