package com.company;

import java.util.Scanner;

public class Loops_Practice_Set {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	// natural numbers from 1 to n using for loop
	//int n = sc.nextInt();
	//int k = 1;
	//for(;k <= n; k++) {
		//System.out.println(k);
	//}
	 //even number between 1 to 100 using for loop
	/*int sum =0;
		for(int i=1; i<5;i++) {
			
			System.out.println("Even number is" +" " +2*i);
			sum = sum+(2*i);
			}
		
		//System.out.println(sum);
		 
		int sum =0;
		for(int i=1; i<5;i++) {
			
			System.out.println("Even number is" +" " +(2*i+1));
			sum = sum+(2*i+1);
			}
		
		System.out.println(sum);
	// multiplication table
	for(int x = 1;x<=10;x++) {
		System.out.println("The Multiplication table of 5 is "+" " +5*x);
	}*/
	System.out.println("Enter any value");
	int n = sc.nextInt();
	System.out.println("har har mahdev......");
	
	int count = 0;
	
	for(; n>0;count++) {
		n=n/10;
		//System.out.println("n");
	}
	System.out.println(count);
	
}
}
