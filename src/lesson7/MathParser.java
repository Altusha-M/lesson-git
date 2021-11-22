package lesson7;

import java.util.Map;
import java.util.Scanner;

public class MathParser {


	// x1 + 2 * x2 * x3
	public int calculate(String input) {

		int[] operands = parseOperands(input);

		char[] operators = parseOperators(input);
		int result = proceed(operands, operators);
		int x = 1 + 2;
		return result;

	}

	private int proceed(int[] operands, char[] operators) {
		int result;

		for (int i = 0; i < operators.length; i++) {
			char currentOperation = operators[i];
			int currentResult;
			int left = operands[i];
			int right = operands[i + 1];

//			for ()
//
//				if ("*".equals(operators[i]) || "/".equals(operators[i])) {
//
//				if ("*".equals(currentOperation)) {
//					currentResult = left * right;
//				} else if ("/".equals(currentOperation)) {
//					currentResult = left / right;
//				}


			if ("+".equals(currentOperation)) {
				currentResult = left + right;
			} else if ("-".equals(currentOperation)) {
				currentResult = left - right;
			}

		}

		return result;
	}

	// x1 + 2 - x2
	private char[] parseOperators(String input) {

		String[] splittedInput = input.split(" ");
		//[x1, +, 2, -, x2]
		int operatorsNum = (splittedInput.length - 1) / 2;
		int counter = 1;
		char[] operators = new char[operatorsNum];
		for (int i = 0; i < splittedInput.length; i++) {
			if("+".equals(splittedInput[i])) {
				operators[counter++] = splittedInput[i].charAt(0);
			} else if("-".equals(splittedInput[i])) {
				operators[counter++] = splittedInput[i].charAt(0);
			} else if("*".equals(splittedInput[i])) {
				operators[counter++] = splittedInput[i].charAt(0);
			} else if("/".equals(splittedInput[i])) {
				operators[counter++] = splittedInput[i].charAt(0);
			} else {
				throw new RuntimeException("Операция не распознана");
			}
		}

		return operators;
	}

	private int[] parseOperands(String input) {
		String[] resultString = input.split("/+/-///*");
		int[] result = new int[resultString.length];
		int varCounter = 1;
		for (int i = 0; i < resultString.length; i++) {
			if (resultString[i].startsWith("x")) {
				System.out.println("Введите x" + varCounter++ + ": ");
				Scanner scanner = new Scanner(System.in);
				int currentX = scanner.nextInt();
				result[i] = currentX;
			} else {
				result[i] = Integer.parseInt(resultString[i]);
			}
		}

		return result;
	}
}











