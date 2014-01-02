package com.kozanoglu.solutions_001_025;

public class Problem023 {
	
	
	public static int sumofproperdivisors(int n) {
		int total = 0;
		for (int i=1; i < n; i++) {
            if(n % i == 0) {
                  total += i;
            }
		}
            return total;
    }

	
	public static void main(String[] args) {

		int sum = 0;
		int[] AbundantNumbers = new int[6965];
		int counter = 0;
		for (int n = 0; n <= 28123; ++n) {
			if(sumofproperdivisors(n) > n) {
				AbundantNumbers[counter] = n;
				++counter;
			}
		}
		boolean[] canBeWrittenasAbundent = new boolean[28124];
		for (int i = 0; i < AbundantNumbers.length; i++) {
		    for (int j = i; j < AbundantNumbers.length; j++) {
		        if (AbundantNumbers[i] + AbundantNumbers[j] <= 28123) {
		            canBeWrittenasAbundent[AbundantNumbers[i] + AbundantNumbers[j]] = true;
		        } else {
		            break;
		        }
		    }
		}
		for (int i = 1; i <= 28123; i++) {
		    if (!canBeWrittenasAbundent[i]) {
		        sum += i;
		    }
		}
		System.out.println(sum);
	}

}
