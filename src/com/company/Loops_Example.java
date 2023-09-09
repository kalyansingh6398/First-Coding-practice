package com.company;

public class Loops_Example {
	public static void main(String args[]) {
         
		// pyramid example
		/* for(int i=1;i<=100;i++) {
			  for(int j=1;j<=i;j++) {
					System.out.print("* ");
			}
			System.out.println();
			System.out.println();
			}*/
		 // reverse pyramid 
		int term ;
		for(int i = 1; i <= 6;i++) {
			for(int j = 6; j >= i;--j) {
				System.out.print("* ");
			}
			System.out.println();
		}
		}
    }

