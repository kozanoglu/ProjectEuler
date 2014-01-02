package com.kozanoglu.solutions_001_025;

public class Problem003 {
	
	public static void main(String[] args) {
		
		int temp = 0;
		 long y = 600851475143l;
	       for (int i=2; i <= y; i++) {
	           while(y % i == 0) {
	               y /= i;
	               if (i > temp)
	               temp = i;
	           }
	       }
	    System.out.println("Answer is " + temp);
	}
	
	

}
