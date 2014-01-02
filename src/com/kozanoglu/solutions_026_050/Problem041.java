package com.kozanoglu.solutions_026_050;

public class Problem041 {
	
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

	public static void main(String[] args) {

		
		// 8 ve 9 digitlik pandigital sayýlar 3'ün katý olacaðý için asal da olamaz bu sebeple döngüye katmadýk
				for(int i = 7654321; i > 1 ; --i ) {
					if(isPandigital(i)) {
						if (isPrime(i)) {
							System.out.println(i);
							break;
						}
					}
				}
	}

}
