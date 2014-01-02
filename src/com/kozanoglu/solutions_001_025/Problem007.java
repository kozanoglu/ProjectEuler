package com.kozanoglu.solutions_001_025;

public class Problem007 {
	
	
	// sayinin asal olup olmadigini belirleyen fonk.
	public static boolean asal(int n) {
		for (int i = 2; i < n; i++)
			if (n % i == 0) {
				return false;
			}
		return true;
	}

	public static void main(String[] args) {

		int count = 5;
		for (int i = 13;; ++i) {
			if (asal(i)) {
				++count;
				if (count == 10001) {
					System.out.println(i);
					break;
				}
			}
		}

	}

}
