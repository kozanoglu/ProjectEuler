package com.kozanoglu.solutions_051_075;

import java.math.BigInteger;

public class Problem053 {
	
	public static BigInteger combination(int a, int b) {
		BigInteger n = BigInteger.valueOf(a);
		BigInteger bir = BigInteger.ONE;
		BigInteger x = BigInteger.ONE;
		BigInteger answer = BigInteger.ONE;
		
		for(int i = b; i > 0; --i) {
			answer = answer.multiply(n);
			answer = answer.divide(x);
			x = x.add(bir); 					
			n = n.subtract(bir); 
		}
		return answer;
	}


	public static void main(String[] args) {


		int sum = 0;
		BigInteger million = BigInteger.valueOf(1000000);

		for(int n = 1; n <= 100; ++n) {
			for (int r = 1; r <= n; ++r) {
				if(combination(n, r).compareTo(million) >= 0) {	
						sum += 1;
						System.out.println(n + " " + r );
						System.out.println(combination(n, r));				
				}
			}
		}		
		System.out.println(sum);

	}

}
