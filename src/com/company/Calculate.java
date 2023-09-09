package com.company;
import java.util.Scanner;
public class Calculate {

	public static void main(String args[]) {
		//Question1
		/*float sub1 = 20;
		float sub2 = 30;
		float sub3 = 40;
		float cgpa = (sub1+sub2+sub3)/30;
		System.out.println(+cgpa);*/
		//Question2
		
		//System.out.println("what is your name");
		//Scanner sc = new Scanner(System.in);
		//String name = sc.next();
		//System.out.println("hello " + name + " have a good day");
		//Question 4
		//int kilometer = 20;
	   // double n = 0.621371;
		//double miles = (kilometer*n);
		//System.out.println(miles);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a math mark :-");
		float m=sc.nextFloat();
		
		System.out.println("Enter a physics mark :-");
		float p=sc.nextFloat();
		
		System.out.println("Enter a chemistry mark :-");
		float c=sc.nextFloat();
		
		System.out.println("Enter a Hindi mark :-");
		float h=sc.nextFloat();
		
		System.out.println("Enter a English mark :-");
		float e=sc.nextFloat();
		
		float res=(m+p+c+h+e)/5;
		
		System.out.println("perctenage of mark  "+res);
		
		
	}
}
