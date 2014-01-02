package com.kozanoglu.solutions_026_050;

import java.util.ArrayList;

public class Problem028 {

	
	public static void main(String[] args) {


		int n;
	    long sum = 0;
	    for(n = 0; n <= 500; n++) {
	        sum += ((2*n+1)*(2*n+1));       // Same as (2*n+1)^2
	        sum += ((2*n+1)*(2*n+1)) - 6*n; // Same as (2*n+1)^2 - 6*n
	        sum += ((2*n+1)*(2*n+1)) - 4*n; // Same as (2*n+1)^2 - 4*n
	        sum += ((2*n+1)*(2*n+1)) - 2*n; // Same as (2*n+1)^2 - 2*n
	    }
	    System.out.println("Result is: " + (sum-3));
	    
		//  prob 29
		ArrayList<Double> list = new ArrayList<Double>();
		for(int a = 2; a <= 100; ++a)
			for(int b = 2; b <= 100; ++b)
				if (list.contains(Math.pow(a,b)) == false)
                    list.add(Math.pow(a, b));
		System.out.println(list.size()); 

	}

}
