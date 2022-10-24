package common;

import java.util.Scanner;

public class InputName {
	private String compName;
	private Scanner sc = new Scanner(System.in);

	//Add competitor
	public void addCompetitor() {

		//boolean med while loop kontrollerar att scanner innehåller bokstäver från a-ö.
		// om det stämmer så skicka vidare input till string "compName" annars svara med "only use letters".

		boolean active = true;
		while (active) {

			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();

			if (!compName.matches(".*[a-öA-Ö]")) {
				System.out.println("Only use letters when putting in competitors name.");

			} else {

				active = false;
			}
		}
	}

	public String getCompName() {
		return compName;

	}
}