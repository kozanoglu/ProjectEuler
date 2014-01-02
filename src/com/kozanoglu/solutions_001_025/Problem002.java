package com.kozanoglu.solutions_001_025;

public class Problem002 {

	
	public static int fib(int n) { 
	    if (n < 2)
	        return n;
	        return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {

		int sum = 0;
		for (int x = 0; fib(x) < 4000000; ++x) {
			if (fib(x) % 2 == 0)
				sum += fib(x);
		}
		System.out.println(sum);
	}

}
