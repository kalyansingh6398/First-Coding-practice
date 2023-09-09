package com.company;

public class Widening_Type_Casting {

	public static void main(String args[]) {
		//Widening conversion
		/*int x = 7;
		float y = x;
		double z = x ;
		System.out.println(x);	//Before conversion, int value	
		System.out.println(y); //After conversion, long value
		System.out.println(z);//After conversion, float value
		
		int i = 100;
		long l = i;
		float f = l;
		System.out.println(+i);
		System.out.println(+i);
		System.out.println(+f);
		
		
		int i = 97;
		char c =(char)i;
		short s = (short)c;
        System.out.println(i);
		System.out.println(c);
		System.out.println(s);

		*/
		byte b ;
		int i = 257;
		double d = 323.142;
		b = (byte)i;
		System.out.println(b);

		b = (byte)d;
		System.out.println(b);


		
		
	}
}

		