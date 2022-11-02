package Literals;

public class Java_Literals {

	public static void main(String[] args) {
		/* Integer Literals
		 * Decimal     Base 10
		 * Octal       Base 8
		 * Hexadecimal Base 16
		 * Binary      Base 2
		 */
		int Decimal     = 123;    //Decimals starts from 0 to 9.
		int Binary      = 0B0101; //Number prefixed with 0B/0b is considered as Binary
		int Octal       = 043;    // Number prefixed with 0 is considered as Octal
		int HexaDecimal = 0XA;    // Number prefixed with 0X / 0x is considered as Hexadecimal
		
		System.out.println("***INTEGER LITERAL***");
		System.out.println("Decimal Value: " +Decimal);
		System.out.println("Binary Value: " +Binary);
		System.out.println("Octal Value: " +Octal);
		System.out.println("HexaDecimal Value: " +HexaDecimal);
		
		int V = 123_645_1;// You can use more than one underscore in between number for readability 
		System.out.println("Value of V: " +V);
		
		/*	Floating-point Literals
		 *  Floating-point literals in Java default to double precision.
		 *  To specify a float literal, you must append an F or f to the constant.
		 *  
		 */
		float FloatValue  = 123.4f; //You can also use underscore in between values of float value
		System.out.println();
		System.out.println("***FLOATING POINT LITERAL***");
		System.out.println("Float Value: " +FloatValue);
		
		/* Boolean literals are simple. 
		 * There are only two logical values that a boolean value can have, true and false. 
		 * The values of true and false do not convert into any numerical representation.
		 */
		boolean BooleanValue = true;
		System.out.println();
		System.out.println("***BOOLEAN LITERAL***");
		System.out.println("Boolean Value: " +BooleanValue);
		
		/* Character Literal
		 * Characters in Java are indices into the Unicode character set. 
		 * They are 16-bit values that can be converted into integers and manipulated with the integer operators, such as the addition and subtraction operators. 
		 * 
		 * For characters that are impossible to enter directly, 
		 * there are several escape sequences that allow you to enter the character you need, 
		 * such as ' \' ' for the single-quote character itself and ' \n' for the newline character.
		 * 
		 * 
		 */
		
		char CharacterValue = 'A';
		System.out.println();
		System.out.println("***CHARACTER LITERAL***");
		System.out.println("Character Value: " +CharacterValue);
		System.out.println("Single quote: " +"\'");
		System.out.println("Double quote: " +"\"");
		System.out.println("Backslash: " +"\\");
		
		/*
		 * STRING LITERAL
		 * sequence of characters between a pair of double quotes.
		 */
		
		String Name = "Java";
		System.out.println();
		System.out.println("***STRING LITERAL***");
		System.out.println("Name: " +Name);

	}

}


//Author: Krishna