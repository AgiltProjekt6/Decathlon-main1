package common;

import excel.ExcelPrinter;

import java.util.Scanner;


public class InputResult {

	double inputResult = 0;

	//try catch kontrollerar så användare anger siffror och inte bokstäver eller specialtecken
	public double enterResult() {
		Scanner sc = new Scanner(System.in);
		boolean active = true;
		while (active) {
			System.out.println("Please enter the result:");
			try {

				inputResult = Double.parseDouble(sc.nextLine());
				active = false;
			} catch (Exception e) {
				System.out.println("Invalid input, try again.");

			}

		}

		//retunerar double värdet från användarens input
		return inputResult;
	}

	public double returnResult() {
		return inputResult;
	}
}