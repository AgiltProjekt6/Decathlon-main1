package common;

import java.util.Scanner;

public class InputName {

	//Add competitor
	public String addCompetitor() {

		//boolean som reagerar på ett falsk eller korrekt beteende, i detta fall kontrollerar att scanner innehåller bokstäver från a-ö.
		// om det stämmer så skicka vidare input till string "compName" annars svara med "only use letters" texten nedan.
		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);

		while (active) {

			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();
			if (!compName.matches(".*[a-öA-Ö]")) {
				System.out.println("Only use letters when putting in competitors name.");

			} else {

				active = false;
			}

		}
		// retunerar användarens input
		return compName;
	}
}