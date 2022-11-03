package Operators;

public class BooleanLogical {

	public static void main(String[] args) {
		/*
		 * The Boolean logical operators shown here operate only on boolean operands.
		 * All of the binary logical operators combine two boolean values to form a resultant boolean value.
		 * Operator				Result
		 *  &				Logical AND
		 *  |				Logical OR
		 *  ^				Logical XOR
		 *  ||				Short-circuit OR
		 *  &&				Short-ciruit AND
		 *  !				Logical unary NOT
		 *  &=				AND Assignment	
		 *  |=				OR Assignment
		 *  ^=				XOR Assignment
		 *  ==				Equal to
		 *  !=				Not Equal to
		 *  ?:				Ternary if-then-else
		 * 
		 */
		
		boolean a = true;
		boolean b = false;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = (!a & b) | (a & !b);
		boolean g = !a;
		System.out.println(" a = " +a);
		System.out.println(" b = " +b);
		System.out.println(" a|b = " +c);
		System.out.println(" a&b = " +d);
		System.out.println(" a^b = " +e);
		System.out.println(" (!a & b) | (a & !b) = " +f);
		System.out.println(" !a = " +g);
		
	}

}

//Author: Krishna