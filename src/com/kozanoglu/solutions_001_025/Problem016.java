package com.kozanoglu.solutions_001_025;

import java.math.BigInteger;

public class Problem016 {

	
	public static void main(String[] args) {

		long sum16 = 0;
		BigInteger n = BigInteger.valueOf(2);
		BigInteger m = n.pow(1000);
		String s = m.toString();
		int[] intArray = new int[s.length()];
		 
		for (int i = 0; i < s.length(); i++) {
			intArray[i] = Character.digit(s.charAt(i), 10);  // Returns the numeric value of the character ch in the specified radix.
		}
		for (int i = 0; i < s.length() ; i++) {
			sum16 += intArray[i];
		}
		System.out.println(sum16);
		
	}

}
