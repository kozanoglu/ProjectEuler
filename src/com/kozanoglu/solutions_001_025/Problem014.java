package com.kozanoglu.solutions_001_025;

public class Problem014 {

	
	public static long col(long k) { // prob 14 için metod
		int sayac=1;
		while (k != 1) {
			if (k % 2 == 0) {
				k/=2;
				sayac++;
			}
			else {
				k=3*k+1;
				sayac++;
			}
		}
	 	return sayac;		
	}
	
	
	public static void main(String[] args) {
		
		long max=0;
		for (int i = 1; i < 1000000; i++) { 
			if (col(i)>max) {
				max=col(i);
				System.out.println(i + " " + col(i));
			}
		}

	}

}
