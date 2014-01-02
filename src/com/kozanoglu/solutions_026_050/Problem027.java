package com.kozanoglu.solutions_026_050;

public class Problem027 {
	
	public static boolean asal(int n) {
		if (n < 0 ) {
			return false;
		}
		else if(n == 1) {
			return false;
		}
		else if (n == 2) {
			return true;
		}
		else if (n % 2 == 0) {
			return false;
		}
		else {
	        for (int i = 3; i < n; i=i+2)
	            if (n % i == 0)
	            return false;
	        return true;
	    }
	}

	
	public static void main(String[] args) {


		int primeCounter = 0;
		int otherCounter = 0;
		int answer = 0;
		int a2 = 0, b2 = 0;
		for (int a = -999; a < 1000; ++a) {
			for (int b = 2; b < 1000; ++b) { //  b'yi 2'den baþlattýk çünkü b her zaman asal olmalý
				for (int n = 0; ; ++n) {
					if(asal((int) (Math.pow(n, 2) + a*n + b))) {
						++primeCounter;
					}
					else if (primeCounter > otherCounter) {
							otherCounter = primeCounter;
							answer = a * b;
							a2 = a;
							b2 = b;
							primeCounter = 0;
							break;
					}
					else {
						primeCounter = 0;
						break;
					}
				}
			}
		}
		System.out.println("The answer is: " + a2 + " * " + b2 + " = "  + answer);

	}

}
