package com.kozanoglu.solutions_026_050;

public class Problem037 {
	
	public static boolean asal(long n) {
		//if(n == 1) {
		//	return false;
		//}
		 if (n == 2) {
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
	
	public static long Reverse(long number) {
	    long reverse = number % 10;
	    number = number / 10;
	    while (number != 0) {
	        reverse = (number % 10) + (10 * reverse);
	        number = number / 10;
	    }
	    return reverse;
	}

	public static void main(String[] args) {

		
	//  çok uzun sürüyor, optimize et.
			int counter = 0;
			long sum37 = 0;
			long n, m;
			for(long i = 11; ; i = i+2) {
				n = i;
				m = i;
				// sondan truncate
				 do
				 {
					if (asal(n)) { 
						n /= 10;
						if(n == 0) {
							// baþtan truncate 
							do
							 {
								if (asal(m)) { 
									m = Reverse((Reverse(m) / 10));
									if(m == 0) {
										System.out.println(i + " soldan ve saðdan truncatable prime.");
										sum37 += i;
										System.out.println("Toplam: " + sum37);
										++counter;
										if(counter == 11) {
											System.exit(0);
										}
									}
								}
								else
									break;
							}
							 while (m != 0);	
						}
					}
					else
						break;
				}
				 while (n != 0);
			}
	}

}
