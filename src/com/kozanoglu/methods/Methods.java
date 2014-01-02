package com.kozanoglu.methods;

import java.math.BigInteger;

public class Methods {
	
	
	public static boolean palindromeChecker(int m) { // prob 4 için bir
														// numaranýn palindrome
														// olup olmadýðýný
														// kontrol eder
		int n = m;
		int reverse = 0;
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + (n % 10);
			n = n / 10;
		}
		if (m == reverse)
			return true;
		return false;
	}

	// bir diðer asal sayý metodu
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

	public static long col(long k) { // prob 14 için metod
		int sayac = 1;
		while (k != 1) {
			if (k % 2 == 0) {
				k /= 2;
				sayac++;
			} else {
				k = 3 * k + 1;
				sayac++;
			}
		}
		return sayac;
	}

	// n faktöriyeli bulan fonk.
	public static BigInteger factBig(int n) {
		if (n < 2) {
			BigInteger m = BigInteger.valueOf(n);
			return m;
		}
		BigInteger m = BigInteger.valueOf(n);
		return m.multiply(factBig(n - 1));
	}

	// n. triangle number hesaplayýcý
	public static long triang(int n) {
		long sum12 = 0;
		for (int i = 1; i <= n; ++i) {
			sum12 += i;
		}
		return sum12;
	}

	public static int triang2(int n) {
		int sum12 = n * (n + 1) / 2;
		return sum12;

	}

	// kombinasyon metodu
	public static BigInteger comb(int m, int n) {
		if (n > m) {
			System.out.println("Bad numbers. " + n + " > " + m
					+ ". Here is a zero for you.");
			return BigInteger.ZERO;
		} else {
			BigInteger a = BigInteger.ONE;
			BigInteger b = BigInteger.ONE;
			BigInteger i2 = BigInteger.ONE;
			BigInteger j2 = BigInteger.ONE;
			for (int i = m; i > m - n; --i) {
				i2 = BigInteger.valueOf(i);
				a = a.multiply(i2);
			}
			for (int j = 1; j <= n; ++j) {
				j2 = BigInteger.valueOf(j);
				b = b.multiply(j2);
			}
			return a.divide(b);
		}
	}
		
		
//  fibonaccinin big integer versiyonu
	public static BigInteger fibBig(int n) { 
		BigInteger a;
		
	    if (n < 2) {
	    	a = BigInteger.valueOf(n);
	    	System.out.println(a);
	        return a;
	    }
	    else {
	    	System.out.println(fibBig(n-1).add(fibBig(n-2)));
	        return fibBig(n-1).add(fibBig(n-2));
	    }
	}
	
	// fibonacci fonk., BigInteger ve dinamik programlama
		public static BigInteger fib2(int n) {
			BigInteger[] fibArray = new BigInteger[10000000];
			int i = 2;
			fibArray[0] = BigInteger.valueOf(0);
			fibArray[1] = BigInteger.valueOf(1);
			while(i <= n) {
				fibArray[i] = (fibArray[i - 1]).add(fibArray[i - 2]);
				++i;
			}
			return fibArray[n];
		}
	
	//  prob 21 için girilen sayýnýn proper divisorlar toplamýný veren metod
	public static int sumofproperdivisors(int n) {
		int total = 0;
		for (int i=1; i < n; i++) {
           if(n % i == 0) {
                 total += i;
           }
		}
           return total;
   }
	
	public static long calcValue(String tmp) {    //  prob 22 için String value hesaplayýcý

			int LocalSum = 0; 
			for (int j = 0; j < tmp.length(); j++)
			{
				if 		(tmp.charAt(j) == 'A')
					LocalSum += 1;
				else if (tmp.charAt(j) == 'B')
					LocalSum += 2;
				else if (tmp.charAt(j) == 'C')
					LocalSum += 3;
				else if (tmp.charAt(j) == 'D')
					LocalSum += 4;
				else if (tmp.charAt(j) == 'E')
					LocalSum += 5;
				else if (tmp.charAt(j) == 'F')
					LocalSum += 6;
				else if (tmp.charAt(j) == 'G')
					LocalSum += 7;
				else if (tmp.charAt(j) == 'H')
					LocalSum += 8;
				else if (tmp.charAt(j) == 'I')
					LocalSum += 9;
				else if (tmp.charAt(j) == 'J')
					LocalSum += 10;
				else if (tmp.charAt(j) == 'K')
					LocalSum += 11;
				else if (tmp.charAt(j) == 'L')
					LocalSum += 12;
				else if (tmp.charAt(j) == 'M')
					LocalSum += 13;
				else if (tmp.charAt(j) == 'N')
					LocalSum += 14;
				else if (tmp.charAt(j) == 'O')
					LocalSum += 15;
				else if (tmp.charAt(j) == 'P')
					LocalSum += 16;
				else if (tmp.charAt(j) == 'Q')
					LocalSum += 17;
				else if (tmp.charAt(j) == 'R')
					LocalSum += 18;
				else if (tmp.charAt(j) == 'S')
					LocalSum += 19;
				else if (tmp.charAt(j) == 'T')
					LocalSum += 20;
				else if (tmp.charAt(j) == 'U')
					LocalSum += 21;
				else if (tmp.charAt(j) == 'V')
					LocalSum += 22;
				else if (tmp.charAt(j) == 'W')
					LocalSum += 23;
				else if (tmp.charAt(j) == 'X')
					LocalSum += 24;
				else if (tmp.charAt(j) == 'Y')
					LocalSum += 25;
				else if (tmp.charAt(j) == 'Z')
					LocalSum += 26;
			}
		return LocalSum;		
	}
	
	public static int fact(int i) {
	    if (i < 1) {
	        return 1;
	    }
	 
	    int p = 1;
	    for (int j = 1; j <= i; j++) {
	        p *= j;
	    }
	    return p;
	}
	
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
		
		
	// fibonacci fonk., dinamik programlama
		public static long fib(int n) {
			long[] fibArray = new long[10000000];
			int i = 2;
			fibArray[0] = 0;
			fibArray[1] = 1;
			while(i <= n) {
				fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
				++i;
			}
			return fibArray[n];
		}

		public static boolean PalindromeChecker(int m) {   // prob 36 için bir numaranýn palindrome olup olmadýðýný kontrol eder
			int n = m;									   //  ama 2'li sayý int ya da long'a sýðmýyor
			int reverse = 0;							   //  ayrýca sayýyý ters çevirince baþa gelen 0'larý atýyor
			while( n != 0 ) {
		          reverse = reverse * 10;
		          reverse = reverse + (n % 10);
		          n = n/10;
		    }
			if (m == reverse)
				return true;
			return false;	
		}
		
		
		public static boolean PalindromeChecker3(String m) {   // prob 36 için bir numaranýn palindrome olup olmadýðýný kontrol eder
			String n = getTers(m);
			//System.out.println("Ters string " + n);
			if (m.equals(n))
				return true;
			else
				return false;	
		}
		public static String getTers(String s)
	    {
	        String ters = "";
	        // String'teki Son Karakterden Ýlk Karaktere Kadar Loop
	        for (int i = s.length() - 1; i >= 0; i--)
	            ters += "" + s.charAt(i); // i. Karakteri ters Stringinin Sonuna Ekle
	        return ters;
	    }
		
		public static boolean isPalindrome(String s)   //    string palindrome checker
		{
			String s2 = new StringBuffer(s).reverse().toString();
			if (s.equals(s2))
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
		
		// sayinin asal olup olmadigini belirleyen fonk.
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
			
			public static int rotateNumber(int number) { 
		            int numdigits = (int) Math.log10((double)number); // would return numdigits - 1
		            int multiplier = (int) Math.pow(10.0, (double)numdigits);

		            int r = number % 10; 
		            number = number / 10;
		            number = number + multiplier * r;	 
		            return number;
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
			
			public static boolean isPandigital2(String str) {
			        for (int i = 1; i <= 9; i++) {
			            if (!str.contains("" + i)) {
			                return false;
			            }
			        }
			        return true;
			    }
			
			public static long concat(long a, long b) {
				if(a>0) {
					long c = b;
					while (c > 0) {
						a *= 10;
						c /= 10;
					}
					return a + b;
				}
				else 
					return b;
			}	
		
		
			public static boolean isPentagonal(int a) {
				int pentagonal = 0;
			    for (int n = 1; pentagonal <= a; n++)
			    {
			        pentagonal = n * (3 * n - 1) / 2;
			        if (pentagonal == a)
			            return true;
			    }
			    return false;
				
			}
			public static boolean isHexagonal(int a) {
				 int hexagonal = 0;
				    for (int n = 1; hexagonal <= a; n++)
				    {
				        hexagonal = n * (2 * n - 1);
				        if (hexagonal == a)
				            return true;
				    }
				    return false;
				
			}
			public static int triangleNumber(int n) {
			    return n * (n + 1) / 2;
			}
			
			
			
		    public static boolean isTwiceSquare(long number) {
		        double squareTest = Math.sqrt(number/2);
		        return squareTest == ((int)squareTest);
		    }
		    
			
			public static BigInteger rotate(BigInteger number) {
				BigInteger on = BigInteger.valueOf(10);
				BigInteger high = number.mod(on);
				BigInteger low = number.divide(on);
				while(number.compareTo(on) > 0) {
					high = high.multiply(on);
					number = number.divide(on);
				}
				return high.add(low);
			}
		
		
			public static BigInteger combination(int a, int b) {
				BigInteger n = BigInteger.valueOf(a);
				BigInteger bir = BigInteger.ONE;
				BigInteger x = BigInteger.ONE;
				BigInteger answer = BigInteger.ONE;
				
				for(int i = b; i > 0; --i) {
					answer = answer.multiply(n);
					answer = answer.divide(x);
					x = x.add(bir); 					
					n = n.subtract(bir); 
				}
				return answer;
			}
			
			
			public static int sumOfDigits(BigInteger n) {
				final String s = n.toString();
				int count = 0;
				for (int i = 0; i < s.length(); i++) {
					int d = s.charAt(i) - 48;
					if (d >= 0 && d <= 9) 
						count += d;
				}
				return count;
			}
		
		
		
			public static boolean isPerm(int m, int n) {
				int[] arr = new int[10];

				int temp = n;
				while (temp > 0) {
					arr[temp % 10]++;
					temp /= 10;
				}

				temp = m;
				while (temp > 0) {
					arr[temp % 10]--;
					temp /= 10;
				}

				for (int i = 0; i < 10; i++) {
					if (arr[i] != 0) {
						return false;
					}
				}
				return true;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

}
