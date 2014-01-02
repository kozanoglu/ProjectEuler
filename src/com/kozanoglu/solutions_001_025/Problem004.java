package com.kozanoglu.solutions_001_025;

public class Problem004 {
	
	
	public static boolean palindromeChecker(int m) {   // prob 4 için bir numaranýn palindrome olup olmadýðýný kontrol eder
		int n = m;
		int reverse = 0;
		while( n != 0 ) {
	          reverse = reverse * 10;
	          reverse = reverse + (n % 10);
	          n = n/10;
	    }
		if (m == reverse)
			return true;
		return false;	
	}

	
	public static void main(String[] args) {
		int z;
	     int temp = 0;
	     for(int a = 100; a <= 999; ++a) {
	    	 for(int b = 100; b <= 999; ++b) {
	    		 z = a * b;
	    		 if (palindromeChecker(z)) {
	    			 if(z > temp) {
	    				 temp = z;
	    		 }
	    		 }
	    	 }
	     }
	     System.out.println(temp);

	}

}
