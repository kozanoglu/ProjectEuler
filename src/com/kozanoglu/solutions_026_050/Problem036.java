package com.kozanoglu.solutions_026_050;

public class Problem036 {
	
	public static boolean isPalindrome(String s) {
		String s2 = new StringBuffer(s).reverse().toString();
		if (s.equals(s2))
			return true;
		return false;
	}


	public static void main(String[] args) {

		
		long sum = 0;
		for (int i = 0; i < 1000000; i++) {
			if ( isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i)) )
				sum += i;
			}
		System.out.println(sum);
	}

}
