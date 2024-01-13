package assignment2;
/**
 * The CalculatorEngine class provides methods for performing basic arithmetic calculations.
 * It supports addition, subtraction, multiplication, and division operations.
 */
class CalculatorEngine {
	/**
	 * Calculates the result of the given arithmetic expression.
	 * @param num1 The first operand.
	 * @param num2 The second operand.
	 * @param operator The arithmetic operator (+, -, *, /).
	 * @param equals The equality operator (=).
	 * @return The result of the arithmetic expression.
	 * @Throws IllegalArgumentException If the operator is invalid or the equation is incomplete.
	 */
	public int calculate(int num1, int num2, String operator, String equals) {
		if (equals.matches("=")) {
			switch (operator) {
			case "+":
				return add(num1, num2);
			case "-":
				return subtract(num1, num2);
			case "*":
				return multiply(num1, num2);
			case "/":
				return divide(num1, num2);
			default:
				throw new IllegalArgumentException("Invalid operator: " + operator);
			}
		}
		throw new IllegalArgumentException("Error: Equation incomplete. Equation must end with =");
	}
/**
 * Adds tow numbers.
 * @param num1 The first operand.
 * @param num2 The second operand.
 * @return The sum of the two numbers.
 */
	private int add(int num1, int num2) {
		return num1 + num2;
	}
/**
 * Subtracts the second number from the first number.
 * @param num1 The first operand.
 * @param num2 The second operand.
 * @return The result of the subtraction.
 */
	private int subtract(int num1, int num2) {
		return num1 - num2;
	}
/**
 * Multiplies two numbers.
 * @param num1 The first operand.
 * @param num2 The second operand.
 * @return The product of the two numbers.
 */
	private int multiply(int num1, int num2) {
		return num1 * num2;
	}
/**
 * Divides the first number by the second number.
 * @param num1 The first operand.
 * @param num2 The second operand.
 * @return The result of the division.
 * @throws ArithmeticException If the denominator is zero.
 */
	private int divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("Error: Can not divide by zero! Result is invalid, returning zero.");			
			return 0;
		}
		return num1 / num2;
	}
}
