package assignment2;
/**
 * The Calculator class is a simple calculator program that allows users to input 
 * arithmetic equations in the form "num1 operator num2 =' to perform calculations.
 * The program supports addition, subtraction, multiplication, and division operations.
 * It utilizes the CalculatorEngine and CalculatorInput classes to process user input
 * and perform calculations.
 * 
 * The equations are expected to follow the format:
 * "num1 operator num2 =", where num1 and num2 must be integers, and operator is one
 * of +, -, /, or *.
 * 
 * The program provides a user-friendly interface with instructions and guidelines for input.
 *  Users can enter "0=" to exit the program.
 *  
 *  The program handles various exceptions, include NumberFormatException and
 *  ArithmeticException, providing appropriate error messages.
 *  
 *  The main method initializes instances of CalculatorEngine and CalculatorInput to
 *  handle the arithmetic calculations and user input, respectively.
 *  The program runs in a loop, continuously prompting the user for equations and
 *  displaying the results until the user chooses to exit.
 *  
 *  @author Chunhua Li
 *  Student Number: 041088118
 *  
 */

public class Calculator {
	
	/**
	 * The main entry point for the Calculator program.
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Assignment 2 CST8284 calculator.");
		System.out.println("Written by Chunhua Li, Student Number is 041088118.");
		System.out.println();
		System.out.println("Equations are in the form num1 operator num2 =");
		System.out.println("Where num1 and num2 must be integers,");
		System.out.println("operator is one of +, -, / or *");
		System.out.println();
		System.out.println("Enter 0 = to quit.");
		System.out.println();
		System.out.println();

		CalculatorEngine calculatorEngine = new CalculatorEngine();
		CalculatorInput calculatorInput = new CalculatorInput();

		while (true) {
			System.out.println("Enter your equation:");

			try {
				String input = calculatorInput.getInput();
				if (input.equals("0 =")) {
					System.out.println("Program exiting.");					
					break;
				}
				
				int num1 = calculatorInput.getNum1();
				String operator = calculatorInput.getOperator();
				int num2 = calculatorInput.getNum2();
				String equals = calculatorInput.getEquals();

				int result = calculatorEngine.calculate(num1, num2, operator, equals);
				System.out.println("That answer is: " + result);
			} catch (NumberFormatException e) {
				System.out.println("Error: "+ e.getMessage());			
			} catch (ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
