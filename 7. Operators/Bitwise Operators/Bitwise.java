package Operators;

public class Bitwise {

	public static void main(String[] args) {
		/*
		 * Bitwise Operators
		 * Operator				Result
		 *  ~				Bitwise unary NOT
		 *  &				Bitwise AND
		 *  |				Bitwise OR
		 *  ^				Bitwise exclusive OR
		 *  >>				Shift right
		 *  >>>				Shift right zero fill
		 *  <<				Shift left	
		 *  &=				Bitwise AND assignment
		 *  |=				Bitwise OR assignment
		 *  ^=				Bitwise exclusive OR assignment
		 *  >>=				Shift right assignment
		 *  >>>=			Shift right zero fill assignment
		 *  <<=				Shift left assignment
		 */
		
		int a = 0B0101; //Decimal Value is 5
		int b = 0B1101; //Decimal Value is 13
		
		System.out.println("***Bitwise Operators***");
		System.out.println("Bitwise unary NOT: " +(~a) );
		System.out.println("Bitwise AND: " +(a&b));
		System.out.println("Bitwise OR: " +(a|b));
		System.out.println("Bitwise exclusive OR: " +(a^b));
		System.out.println("Shift right: " +(a>>2));
		System.out.println("Shift right zero fill: " +(a>>>2));
		System.out.println("Shift left: " +(a<<2));
		System.out.println("Bitwise AND assignment: " +(a&=3));
		System.out.println("Bitwise OR assignment: " +(a|=3));
		System.out.println("Bitwise exclusive OR assignment: " +(a^=3));
		System.out.println("Shift right assignment: " +(a>>=2));
		System.out.println("Shift right zero fill assignment: " +(a>>>=2));
		System.out.println("Shift left assignment: " +(a<<=2));
	}

}

//Author: Krishna
