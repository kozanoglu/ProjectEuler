package com.kozanoglu.solutions_026_050;

public class Problem043 {

	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	
	public static void main(String[] args) {
		long sum = 0;
		int[] divisors = { 1,  2, 3, 5, 7, 11, 13, 17 };
		
		int[] perm = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		 
		int count = 1;
		int numPerm = 3265920;
		 
		while (count < numPerm) {
		    int N = perm.length;
		    int i = N - 1;
		    while (perm[i - 1] >= perm[i]) {
		       i = i - 1;
		    }
		 
		    int j = N;
		    while (perm[j - 1] <= perm[i - 1]) {
		        j = j - 1;
		    }
		 
		    // swap values at position i-1 and j-1
		    swap(perm, i - 1, j - 1);
		 
		    i++;
		    j = N;
		    while (i < j) {
		        swap(perm, i - 1, j - 1);
		        i++;
		        j--;
		    }
		    boolean divisible = true;
		    for (int k = 1; k < divisors.length; k++) {
		        int num = 100 * perm[k] + 10 * perm[k + 1] + perm[k + 2];
		        if (num % divisors[k] != 0) {
		            divisible = false;
		            break;
		        }
		    }
		    if (divisible) {
		        long num = 0;
		        for(int k = 0; k < perm.length; k++){
		            num = 10*num + perm[k];
		        }
		        sum += num;
		        
		        System.out.println(num);
		    }
		    count++;
		}
		System.out.println("Sum is: " +  sum);
		
	}
}
