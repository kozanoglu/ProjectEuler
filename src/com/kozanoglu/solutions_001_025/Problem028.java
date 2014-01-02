package com.kozanoglu.solutions_001_025;

public class Problem028 {

	public static void main(String[] args) {

		int n;
	    long sum = 0;
	    for(n = 0; n <= 500; n++) {
	        sum += ((2*n+1)*(2*n+1));       
	        sum += ((2*n+1)*(2*n+1)) - 6*n; 
	        sum += ((2*n+1)*(2*n+1)) - 4*n; 
	        sum += ((2*n+1)*(2*n+1)) - 2*n; 
	    }
	    System.out.println("Result is: " + (sum-3));
	}

}
