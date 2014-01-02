package com.kozanoglu.solutions_001_025;

public class Problem030 {

	
	public static void main(String[] args) {

		int n;
		int sum = 0;
		int finaltotal = 0;
		for (int i = 2; i <= 999999; ++i) {
			n = i;
			while ( n != 0) {
				sum += Math.pow((n%10), 5);
				n = n / 10;
			}
			if (sum == i) {
				System.out.println(i);
				finaltotal += i;
			}
			sum = 0;
		}
		System.out.println(finaltotal);

	}

}
