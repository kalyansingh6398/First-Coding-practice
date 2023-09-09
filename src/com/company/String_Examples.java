package com.company;
import java.util.Scanner;
public class String_Examples {

	public static void main(String args[]) {
		String name = "KaLyanSiNgh";
		//int value = name.length();
		//System.out.println(value);
		
		String lstring = name.toLowerCase();
		System.out.println(lstring);
		String ustring = name.toUpperCase();
		System.out.println(ustring);
		String nontrimmedString = "     RAM MAHAKAL        ";
		
		System.out.println(nontrimmedString);
		
		String trimmedString = nontrimmedString.trim();
		System.out.println(trimmedString);
	}
}
