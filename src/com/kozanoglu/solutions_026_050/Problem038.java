package com.kozanoglu.solutions_026_050;

public class Problem038 {
	
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


	public static void main(String[] args) {

		long product;
        long finalProduct = 0;
        long z;
        for(int j = 1; j < 9999; ++j) {
    		product = 0;
        	for(int i = 1; product < 999999999; ++i) {
        		z = i * j;
        		product=concat(product,z);
        		if(product > 900000000) {
        			if(isPandigital(product)) {
        				if(product > finalProduct) {
        					finalProduct = product;
        				}
        			}
        		}
        	}
        }
        System.out.println(finalProduct);

	}

}
