package com.kozanoglu.solutions_76_100;

import java.math.BigInteger;

public class Problem097 {


	public static void main(String[] args) {
		
		// önce 2^7830457'nün 10 digitini veren modülünü aldýk sonra 28433'le
		// çarpýp 1 ekledik
		// ilk 10 digitten sonrasýný hesaplamamýza gerek yok
		BigInteger a = new BigInteger("2");
		BigInteger mod = new BigInteger("10000000000");
		a = a.modPow(new BigInteger("7830457"), mod)
				.multiply(new BigInteger("28433")).add(BigInteger.ONE).mod(mod);
		System.out.println(a);

	}

}
