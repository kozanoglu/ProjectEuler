package com.kozanoglu.solutions_051_075;

import java.math.BigInteger;

public class Problem056 {
	
	public static int sumOfDigits(BigInteger n) {
		final String s = n.toString();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			int d = s.charAt(i) - 48;
			if (d >= 0 && d <= 9) 
				count += d;
		}
		return count;
	}


	public static void main(String[] args) {


		int sum = 0;
		for (int a = 91; a <= 99; a++) {    //  ilk 90 sayýyý atladýk
			for (int b = 91; b <= 99; b++) {
				BigInteger n = BigInteger.valueOf(a).pow(b);
				if (sumOfDigits(n) > sum)
					sum = sumOfDigits(n);
			}
		}
		System.out.println(sum);

	}

}
