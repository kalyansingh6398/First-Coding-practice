package com.company;
import java.util.Scanner;
public class If_Else_Statement {
	public static void main(String args[]) {
	int largest;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The First Number");
	int num1 = sc.nextInt();
	System.out.println("Enter The Second Number");
	int num2 =sc.nextInt();
	System.out.println("Enter The Third Number");
	int num3 =sc.nextInt();
	if(num1 > num2 && num1 > num3) 
		largest = num1;
		//System.out.println(largest);
	else if(num2 > num3)
	largest = num2;
	else 
		largest = num3;
	
	System.out.println("Largest number among three =" +largest);
	
    }
}