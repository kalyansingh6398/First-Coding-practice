package com.company;
import java.util.Scanner;

public class Java_Practice_set4 {
	public static void main(String args[]) {
		//Question 2
		//byte m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter the marks of physics");
		m1 =sc.nextByte();
		System.out.println("Enter the marks of chemistry");
		m2 =sc.nextByte();
		System.out.println("Enter the marks of math");
		m3 =sc.nextByte();
		float avg = (m1+m2+m3)/3.0f;
		System.out.println("Your overall percentage is:" + avg);
		if(avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
			System.out.println("Conguratulation you are pass ");
		}
		else {
			System.out.println("Conguratulation you are not pass ");
		} 
		//question 3
		//250000----> no tax
		//250000 b/w 500000----->5%
		//500000 b/w 1000000----->20%
		//1000000---->30%
		int income ;
		double tax;
		System.out.println("Enter the income of employee");
		income = sc.nextInt(); 
		if(income<=250000) {
			System.out.println(income +"  " +" no tax " );
		}
		else if(income >250000 && income <=500000 ) {
			tax = income * 0.05;
			System.out.println(income +" " + tax);
		}
		else if(income > 500000 && income <=1000000 ) {
			tax = income * 0.2;
			System.out.println(income +" " + tax);
		
		}
		
		else {
			tax = income * 0.3;
			System.out.println(income +" " + tax);
		}*/
		// leap year program
		// 1. century(100%=0 and 400%=0) 2000 2400 (400 year gap is leap year)
		// 2.yearly (100%=0 and 4%=0)2020 2024 
		//int year = 2000
		
		int year = sc.nextInt();
		/* century
		 if(year%100 == 0 && year%400 == 0) {
			System.out.println("This year is leap year");
			
		}
		else {
			System.out.println("This year is not leap year");
			
		}*/
		// yearly
		//int year = sc.nextInt();
		if(year%100 != 0 && year%4 == 0) {
			System.out.println("This year is leap year");
			
		}
		else {
			System.out.println("This year is not leap year");
			
		}
		
	}

}
