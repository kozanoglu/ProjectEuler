package com.kozanoglu.solutions_026_050;

public class Problem034 {
	
	public static boolean isCurious(int n) {
		String string = Integer.toString(n);
	    int[] digits = new int[string.length()];
	    long sum = 0;
		  for(int i = 0; i<string.length(); ++i){
		    digits[i] = Integer.parseInt(string.substring(i, i+1));
		  }
		  for (int i = 0; i <= string.length()-1; ++i)
			  sum += factorial(digits[i]);
		  if(n == sum)
			  return true;
		  return false;		
	}
	
	public static int factorial(int x) {
		int factorial = 1;
		for (int i = x; i > 1; --i) {
			factorial = factorial * i;
		}
		return factorial;
	}


	public static void main(String[] args) {


		long sum34 = 0;
		for (int i = 146; ; ++i) {
			if (isCurious(i)) {
				System.out.println(i);
				sum34 = i;
				break;
			}		
		}
		System.out.println(sum34 + 145);

	}

}
