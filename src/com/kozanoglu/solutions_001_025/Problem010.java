package com.kozanoglu.solutions_001_025;

public class Problem010 {
	
	public static boolean isPrime(int i) {
		if (i < 2) {
			return false;
		} else if (i % 2 == 0 && i != 2) {
			return false;
		} else {
			for (int j = 3; j <= Math.sqrt(i); j = j + 2) {
				if (i % j == 0) {
					return false;
				}
			}
			return true;
		}
	}

	
	public static void main(String[] args) {

		long sum10 = 2;
		for(int i = 3; i < 2000000 ; i+=2) {
			if (isPrime(i))
				sum10 += i;
		}
		System.out.println(sum10);

	}

}
