package com.kozanoglu.solutions_026_050;

import java.util.ArrayList;
import java.util.List;

public class Problem032 {
	
	public static boolean isPandigital(long n) {
	    int digits = 0;
	    int count = 0;
	    int tmp;
	 
	    while (n > 0) {
	        tmp = digits;
	        digits = digits | 1 << (int)((n % 10) - 1);
	        if (tmp == digits) {
	            return false;
	        }
	 
	        count++;
	        n /= 10;
	    }
	    return digits == (1 << count) - 1;
	}

	
	public static long concat(long a, long b) {
		if(a>0) {
			long c = b;
			while (c > 0) {
				a *= 10;
				c /= 10;
			}
			return a + b;
		}
		else 
			return b;
	}

	
	public static void main(String[] args) {

		List<Long> products = new ArrayList<Long>();            
        long sum = 0;
        long prod, compiled;
         
        for (long m = 2; m < 100; m++) {
             long nbegin = (m > 9) ? 123 : 1234;
             long nend = 10000 / m + 1;
            
             for (long n = nbegin; n < nend; n++) {                               
                prod = m * n;
                compiled = concat(concat(prod, n), m);                    
                if (compiled >= 1E8 && compiled < 1E9 && isPandigital(compiled)) {
                    if (!products.contains(prod)) {
                        products.add(prod);
                    }
                }
            }
        }
        for(Long x : products) {
        	sum += x;
        }
        System.out.printf("The sum of all pan digital number from 1-9 is %d", sum);
		
	}

}
