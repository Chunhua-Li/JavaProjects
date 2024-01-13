package assignment2;

import java.util.Scanner;
/**
 * The CalculatorInput class handles user input for arithmetic equations.
 * It reads input from the keyboard and provides methods to retrieve
 * the first number, operator, second number, and equals sign in an equation.
 */
class CalculatorInput {
	private Scanner keyboard;
	private Scanner input;
	
/**
 * Constructs a CalculatorInput object with a Scanner for keyboard input.
 */
	public CalculatorInput() {
		keyboard = new Scanner(System.in);
	}
/**
 * Reads a line of input from the keyboard and returns it as a String.
 * @return The user input as a String.
 */
	public String getInput() {
		String buffer = keyboard.nextLine();
		input = new Scanner(buffer);
		return buffer;
	}
/**
 * Retrieves the first number from the user input.
 * @return The first number in the equation.
 * @throws IllegalArgumentException If the equation is incomplete or the first number is not an integer.
 */

	public int getNum1() {
	    if (!input.hasNext()) {
	        throw new IllegalArgumentException("Equation incomplete. First number is missing");
	    }

	    String firstString = input.next();

	    if (firstString.matches("[+\\-*/]")) {
	        throw new IllegalArgumentException("Equation incomplete. First number is missing");
	    }

	    try {
	        int num1 = Integer.parseInt(firstString);
	        return num1;
	    } catch (NumberFormatException e) {
	        throw new IllegalArgumentException("First number is not an integer");
	    }
	}

	
/**
 * Retrieves the operator from the user input.
 * @return The operator in the equation.
 * @throws IllegalArgumentException If the equation is incomplete, the operator is invalid, or an InputMismatchException occurs.
 */
	public String getOperator() {
	    if (input.hasNext()) {
	        String secondString = input.next();

	        if (!secondString.matches("[+\\-*/]")) {
	            throw new IllegalArgumentException("Invalid operator. Valid operators are +, -, /, and *");
	        }

	        String operator = secondString;
	        return operator;
	    }

	    throw new IllegalArgumentException("Equation incomplete. Operator is missing");
	}

/**
 * Retrieves the second number from the user input.
 * @return The second number in the equation.
 * @throws IllegalArgumentException If the equation is incomplete, the second number is not an integer,
 * or an InputMismatchException occurs.
 */
	public int getNum2() {
	    if (input.hasNext()) {
	        String thirdString = input.next();

	        if (thirdString.matches("=")) {
	            throw new IllegalArgumentException("Second number is missing");
	        }

	        try {
	            int num2 = Integer.parseInt(thirdString);
	            return num2;
	        } catch (NumberFormatException e) {
	            throw new IllegalArgumentException("Second number is not an integer");
	        }
	    }

	    throw new IllegalArgumentException("Second number is missing");
	}

/**
 * Retrieves the equals sign from the user input.
 * 
 * @return The equals sign in the equation.
 * @throws IllegalArgumentException If the equation is incomplete or does not end with the equals sign.
 */
	public String getEquals() {
	    if (input.hasNext() && input.next().equals("=")) {
	        String equals = "=";
	        return equals;
	    }

	    throw new IllegalArgumentException("Equation incomplete. Equation must end with =");
	}

}
