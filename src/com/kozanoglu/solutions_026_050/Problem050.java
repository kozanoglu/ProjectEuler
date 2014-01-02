package com.kozanoglu.solutions_026_050;

import java.util.Arrays;

public class Problem050 {
	
	public static boolean isPrime(int number) {
    	int squrtNumber = (int) Math.floor(Math.sqrt(number))+1;
    	int pn = 2;
    	if (number < 2) {
    		return false;
    	}
    	while (pn < squrtNumber) {
    		if (0 == number%pn) 
    			return false;
    		pn ++;
    	}
    	return true;
	}


	public static void main(String[] args) {


		long[] primesArray = new long[78498];
		long[] primeSum = new long[primesArray.length + 1];
		primesArray[0] = 2;
		int j = 1;
		for(int i = 3; i <= 1000000; i = i+2) {
			if (isPrime(i)) {
				primesArray[j] = i;
				++j;
			}
		}
		primeSum[0] = 0;
		for (int i = 0; i < primesArray.length; i++) {
		    primeSum[i+1] = primeSum[i] + primesArray[i];
		}
		long result = 0;
		int numberOfPrimes = 0;
		for (int i = numberOfPrimes; i < primeSum.length; i++) {
		    for (int k = i-(numberOfPrimes+1); k >= 0; k--) {
		        if (primeSum[i] - primeSum[k] > 1000000) 
		        	break;
		 
		        if (Arrays.binarySearch(primesArray, primeSum[i] - primeSum[k]) >= 0) {
		            numberOfPrimes = i - k;
		            result = primeSum[i] - primeSum[k];
		        }
		    }
		}
		System.out.printf("Largest prime below 1000000 written as consequtive primes is %d.\n", result);
		System.out.printf("It consists of %d primes.", numberOfPrimes);

	}

}
