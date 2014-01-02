package com.kozanoglu.solutions_001_025;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem017 {


	public static void main(String[] args) {


		// 1. çözüm
				Map<Integer, String> map = new HashMap<Integer, String>();
				{   map.put(1, "one");
		            map.put(2, "two");
		            map.put(3, "three");
		            map.put(4, "four");
		            map.put(5, "five");
		            map.put(6, "six");
		            map.put(7, "seven");
		            map.put(8, "eight");
		            map.put(9, "nine");
		            map.put(10, "ten");
		            map.put(11, "eleven");
		            map.put(12, "twelve");
		            map.put(13, "thirteen");
		            map.put(14, "fourteen");
		            map.put(15, "fifteen");
		            map.put(16, "sixteen");
		            map.put(17, "seventeen");
		            map.put(18, "eighteen");
		            map.put(19, "nineteen");
		            map.put(20, "twenty");
		            map.put(30, "thirty");
		            map.put(40, "forty");
		            map.put(50, "fifty");
		            map.put(60, "sixty");
		            map.put(70, "seventy");
		            map.put(80, "eighty");
		            map.put(90, "ninety");
		            map.put(100, "hundred");
		            map.put(1000, "onethousand");
				};
				List<String> words = new ArrayList<String>();
				
		        for(int i = 1; i<= 1000; i++){
		                if(i != 1000){
		                	String hundString = "";
		                	String finalString = "";
		            		String word = "";
		                        if(i <=1000 && i >= 100){
		                                String prefixHundredString = map.get(i/100);
		                                String postfixhundredthString = map.get(100);
		                                hundString = prefixHundredString + postfixhundredthString;
		                        }
		                        // number = sayýnýn yüzler basamaðý atýlmýþ hali
		                        int hun = i/100;
		                        int number = i - hun*100;
		                        
		                       if(number > 0) {
		                            word = map.get(number);
		                            if(word == null){
		                                    int tenthPlace = number/10;
		                                    int unitPlace = number%10;
		                                    String tenthString = map.get(tenthPlace*10);
		                                    String unitString = map.get(unitPlace);
		                                    word = tenthString + unitString;
		                            }
		                    }
		                        if(hundString.equals("")){  //  sayýnýn yüzler basamaðý 0 ise
		                                finalString = word;
		                        }
		                        else {
		                                if (word.equals("")){    //  sayýnýn onlar basamaðý 0 ise
		                                        finalString = hundString;
		                                }
		                                else {
		                                        finalString = hundString + "and"+ word;
		                                }  
		                        }
		                        System.out.println(finalString);
		                        words.add(finalString);
		                }
		                else {
		                        String st = map.get(1000);
		                        System.out.println(st);
		                        words.add(st);
		                }             
		        }        
		        int length = 0;
		        for(String x : words){
		                length += x.length();
		        }
		        System.out.println("Answer--> " + length);

				//  2. çözüm
				int answer = 0;
				for(int i = 1; i <= 999; i++){
					String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
					String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
					String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
					
					String num = String.valueOf(i);
					String temp = "";
					
					if(num.length() == 1)
						temp = ones[i - 1];
					else if(num.length() == 2)
						if(num.charAt(0) == '1')
							temp = teens[Integer.parseInt(num.substring(1))];
						else{
							temp = tens[Integer.parseInt(num.substring(0, 1)) - 2];
							if(num.charAt(1) != '0')
								temp += ones[Integer.parseInt(num.substring(1)) - 1];
					}
					else if(num.length() == 3){
						if(num.charAt(1) == '0' && num.charAt(2) == '0')
							temp = ones[Integer.parseInt(num.substring(0, 1)) - 1] + "hundred";
						else if(num.charAt(1) == '0')
							temp = ones[Integer.parseInt(num.substring(0, 1)) - 1] + "hundredand" + ones[Integer.parseInt(num.substring(2)) - 1];
						else if(num.charAt(1) == '1')
							temp = ones[Integer.parseInt(num.substring(0, 1)) - 1] + "hundredand" + teens[Integer.parseInt(num.substring(2))];
						else if(num.charAt(2) == '0')
							temp = ones[Integer.parseInt(num.substring(0, 1)) - 1] + "hundredand" + tens[Integer.parseInt(num.substring(1, 2))-2];
						else
							temp = ones[Integer.parseInt(num.substring(0, 1)) - 1] + "hundredand" + tens[Integer.parseInt(num.substring(1, 2))-2] + ones[Integer.parseInt(num.substring(2)) - 1];
					}
					answer += temp.length();
				}
				System.out.println(answer+11);

	}

}
