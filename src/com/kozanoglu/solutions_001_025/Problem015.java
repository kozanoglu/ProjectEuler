package com.kozanoglu.solutions_001_025;

import java.math.BigInteger;

public class Problem015 {

	
	// kombinasyon metodu
	public static BigInteger comb(int m, int n) {
		if (n > m) {
			System.out.println("Bad numbers. " + n + " > " + m
					+ ". Here is a zero for you.");
			return BigInteger.ZERO;
		} else {
			BigInteger a = BigInteger.ONE;
			BigInteger b = BigInteger.ONE;
			BigInteger i2 = BigInteger.ONE;
			BigInteger j2 = BigInteger.ONE;
			for (int i = m; i > m - n; --i) {
				i2 = BigInteger.valueOf(i);
				a = a.multiply(i2);
			}
			for (int j = 1; j <= n; ++j) {
				j2 = BigInteger.valueOf(j);
				b = b.multiply(j2);
			}
			return a.divide(b);
		}
	}
	
	
	public static void main(String[] args) {


		//  problem aslýnda bir kombinasyon problemi, bulmamýz gereken þey C(40, 20);
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		BigInteger i2 = BigInteger.ONE;
		BigInteger j2 = BigInteger.ONE;
		for (int i = 40; i > 20; --i)
		{	i2 = BigInteger.valueOf(i);
			a = a.multiply(i2); }
		for (int j = 1; j <= 20; ++j) {
			j2 = BigInteger.valueOf(j);
			b = b.multiply(j2);}
		System.out.println(a.divide(b));
		
		//  veya
		
		System.out.println(comb(40, 20));

	}

}
