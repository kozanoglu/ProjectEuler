package com.kozanoglu.solutions_026_050;

import java.util.HashSet;
import java.util.Iterator;

public class Problem046 {
	
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


		HashSet<Integer> primes = new HashSet<Integer>();
		primes.add(2); // the only even prime
		Iterator<Integer> it;
		int diff, sq;
		loop: for (int odd = 3; true; odd += 2) { // loop through all odds
			if (isPrime(odd)) {
				// if the odd is prime, buffer it and go to next
				primes.add(odd);
				continue;
			}
			it = primes.iterator();
			while (it.hasNext()) {
				diff = odd - it.next();
				if ((diff & 1) == 1)
					continue; // if difference is odd, try next prime
				diff /= 2; // get half the diff
				sq = (int) Math.sqrt(diff);
				if (diff == sq * sq)
					continue loop; // this odd number can be written as a sum,
									// go to next one
			}
			System.out.println(odd);
			break;
		}
	}

}
