package common;

import java.util.Scanner;

public class InputName {

	//Add competitor
	public String addCompetitor() {

		//boolean som reagerar p� ett falsk eller korrekt beteende, i detta fall kontrollerar att scanner inneh�ller bokst�ver fr�n a-�.
		// om det st�mmer s� skicka vidare input till string "compName" annars svara med "only use letters" texten nedan.
		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);

		while (active) {

			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();
			if (!compName.matches(".*[a-�A-�]")) {
				System.out.println("Only use letters when putting in competitors name.");

			} else {

				active = false;
			}

		}
		// retunerar anv�ndarens input
		return compName;
	}
}