package com.kozanoglu.solutions_026_050;

public class Problem035 {
	
	public static boolean isPrime(int number) {
    	int squrtNumber = (int) Math.floor(Math.sqrt(number))+1;
    	int pn = 2;
    	while (pn < squrtNumber) {
    		if (0 == number%pn) 
    			return false;
    		pn ++;
    	}
    	return true;
	}
	
	public static int rotate(int number) {
		int high = number%10;
		int low = number/10;
		while(number > 10) {
			high *= 10;
			number /= 10;
		}
		return high + low;
	}
	
	public static boolean isCircularPrime(int number) {
		int rotatedNumber = number;
		do {
			if(!isPrime(rotatedNumber))
				return false;
			rotatedNumber = rotate(rotatedNumber);
		} while(number != rotatedNumber);			
		return true;
	}
	
	public static boolean circularPrime(int i) {
		if(!asal(i)) {
			return false;
		}
		int j = i;
		while (true) {
			i = rotateNumber(i);
			if (i == j) {
				return true;
			}
			else if (!asal(i)) {
					return false;
							
			}
		}
	}
	
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
	
	public static int rotateNumber(int number) { 
        int numdigits = (int) Math.log10((double)number); // would return numdigits - 1
        int multiplier = (int) Math.pow(10.0, (double)numdigits);

        int r = number % 10; 
        number = number / 10;
        number = number + multiplier * r;	 
        return number;
  }


	public static void main(String[] args) {


	//  benim algoritma
			/* bu haliyle �ok uzun s�r�yor. h�zland�rmak i�in �nce b�t�n asallar�n bir ArrayList'e al�nmas�
			 * ve circular olup �olmad���n�n oradan kontrol edilmesi denenebilir. ya da bir circular prime
			 * tespit edildi�inde onun t�m rotasyonlar� bir arrayList'e al�n�p for d�ng�s�nde if(list.contains(i)) 
			 * kullanarak bu say�lar atlanabilir.
			 */
			
			int counter = 1;
			for(int i = 3; i <= 999997; i=i+2) {
					if(circularPrime(i)) {
						System.out.println(i + " circular prime");
						++counter;
					}
					else {
					//	System.out.println(i + " circular prime de�il");
					}	
			}
			System.out.println(counter);
			 
			
			
			//  alternatif algoritma  benimkiyle ayn� ama isPrime metodu h�zl� �al���yor
			int count = 0;
			for (int number = 2; number < 1000000; number ++)
			{
				if(isCircularPrime(number)) count ++;
			}
			System.out.print("the answer is: ");
			System.out.print(count);
	}

}
