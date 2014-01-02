package com.kozanoglu.solutions_026_050;

import java.math.BigInteger;

public class Problem048 {


	public static void main(String[] args) {

		BigInteger sum = BigInteger.ZERO;
		BigInteger one = BigInteger.ONE;
		BigInteger grandTotal = BigInteger.ZERO;
		BigInteger temp = BigInteger.valueOf(10000000000l);
		
		for (int i = 1; i <= 1000; ++i) {
			sum = one.pow(i);
			one = one.add(BigInteger.ONE);
			grandTotal = grandTotal.add(sum);
		}
		System.out.println(grandTotal);
		grandTotal = grandTotal.mod(temp);
		System.out.println(grandTotal);

	}

}
