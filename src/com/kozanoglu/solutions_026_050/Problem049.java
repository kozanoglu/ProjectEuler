package com.kozanoglu.solutions_026_050;

public class Problem049 {

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
	
	public static boolean isPerm(int m, int n) {
		int[] arr = new int[10];

		int temp = n;
		while (temp > 0) {
			arr[temp % 10]++;
			temp /= 10;
		}

		temp = m;
		while (temp > 0) {
			arr[temp % 10]--;
			temp /= 10;
		}

		for (int i = 0; i < 10; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		for(int i = 1001; i < 10000; i = i + 2) {
			int no1 = i;
			int no2 = i + 3330;
			int no3 = no2 + 3330;
			
			if(isPrime(no1)) {
				if(isPrime(no2)) {
					if(isPrime(no3)) {
						if(isPerm(no1, no2)) {
							if(isPerm(no2, no3)) {
									System.out.println(no1 + " + " + no2 + " + " + no3 + " => " + no1 + "" + no2 + "" + no3);
							}
						}
					}
				}
				
			}
		}
		
	}

}
