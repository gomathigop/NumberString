package com.edu;

public class NumberSumString1 {

	public static void main(String[] args) {
		       String str = "33Edu 230m aha070";
		        char[] array = str.toCharArray();
		        int sum = 0;
		        String temp = "";
		        for (int i = 0; i < array.length; i++) {
		            char c = array[i];
		            if (Character.isDigit(c)) {
		                temp += c;
		            } else {
		                if (temp != "") {
		                    sum += Integer.valueOf(temp);
		                    temp = "";
		                }
		            }
		        }
		        if (temp != "") {
		          sum += Integer.valueOf(temp);
		        }
		        System.out.println(sum);
		    }
		}
