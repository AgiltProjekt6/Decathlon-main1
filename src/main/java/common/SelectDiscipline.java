package common;

// scanner för input
import java.util.Scanner;

//importerade klasser som används i "SelectDiscipline"
import decathlon.Deca100M;
import decathlon.Deca1500M;
import decathlon.Deca110MHurdles;
import decathlon.Deca400M;
import decathlon.DecaDiscusThrow;
import decathlon.DecaHighJump;
import decathlon.DecaJavelinThrow;
import decathlon.DecaLongJump;
import decathlon.DecaShotPut;
import decathlon.DecaPoleVault;

import heptathlon.Hep100MHurdles;
import heptathlon.Hep200M;
import heptathlon.Hep800M;
import heptathlon.HeptHightJump;
import heptathlon.HeptJavelinThrow;
import heptathlon.HeptLongJump;
import heptathlon.HeptShotPut;



public class SelectDiscipline {


	// Int för input, inputresultat metod & scanner för input
	int disciplineSelected;
	InputResult inputResult = new InputResult();
	Scanner sc = new Scanner(System.in);

// kallar på metoderna för alla grenar beroende på input val till switch case
	Deca100M deca100M = new Deca100M();
	Deca400M deca400M = new Deca400M();
	Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
	Deca1500M deca1500M = new Deca1500M();
	DecaLongJump decaLongJump = new DecaLongJump();
	DecaHighJump highJump = new DecaHighJump();
	DecaDiscusThrow discusThrow = new DecaDiscusThrow();
	DecaShotPut decaShotPut = new DecaShotPut();
	DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
	DecaPoleVault poleVault = new DecaPoleVault();

	Hep200M hep200M = new Hep200M();
	Hep800M hep800M = new Hep800M();
	Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
	HeptHightJump hepHighJump = new HeptHightJump();
	HeptLongJump hepLongJump = new HeptLongJump();
	HeptShotPut hepShotPut = new HeptShotPut();
	HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();

	ExitAndResults ExitProgram = new ExitAndResults();


	//Receive input	of selection of discipline.

	// tar emot input för switch case och kör try catch Exception för att kontrollera så input inte innehåller
	// något annat än siffror.

	public void inputSelection() {
		System.out.println("Select discipline.");
		printDisciplines();

		try {

			disciplineSelected = Integer.parseInt(sc.nextLine());
			makeSelection();


		} catch (Exception e) {
			System.out.println("Invalid input, try again.");
			System.out.println("");
			inputSelection();
		}

	}

	// Check input of discipline.
	// switch case valet beroende på input.
	public void makeSelection() {
		switch (disciplineSelected) {
			case 1 -> deca100M.calculateResult(inputResult.enterResult());
			case 2 -> deca400M.calculateResult(inputResult.enterResult());
			case 3 -> deca110MHurdles.calculateResult(inputResult.enterResult());
			case 4 -> deca1500M.calculateResult(inputResult.enterResult());
			case 5 -> decaLongJump.calculateResult(inputResult.enterResult());
			case 6 -> highJump.calculateResult(inputResult.enterResult());
			case 7 -> poleVault.calculateResult(inputResult.enterResult());
			case 8 -> discusThrow.calculateResult(inputResult.enterResult());
			case 9 -> decaJavelinThrow.calculateResult(inputResult.enterResult());
			case 10 -> decaShotPut.calculateResult(inputResult.enterResult());
			case 11 -> hep200M.calculateResult(inputResult.enterResult());
			case 12 -> hep800M.calculateResult(inputResult.enterResult());
			case 13 -> hep100MHurdles.calculateResult(inputResult.enterResult());
			case 14 -> hepHighJump.calculateResult(inputResult.enterResult());
			case 15 -> hepLongJump.calculateResult(inputResult.enterResult());
			case 16 -> hepShotPut.calculateResult(inputResult.enterResult());
			case 17 -> hepJavelinThrow.calculateResult(inputResult.enterResult());
			case 18 -> ExitProgram.ExitAndShowResults();

// default åtgärd om input inte innehåller en int
			default -> {
				System.out.println("Invalid input, try again.");
				System.out.println("");
				inputSelection();
			}
		}
	}

	// output för switch case alternativ som användaren har att välja mellan
	// Needs more stuff.
	public void printDisciplines() {
		System.out.println("1. Decathlon 100 meters. (Measured in seconds)");
		System.out.println("2. Decathlon 400 meters. (Measured in seconds)");
		System.out.println("3. Decathlon 110 meters hurdles. (Measured in seconds)");
		System.out.println("4. Decathlon 1500 meters. (Measured in minutes and seconds)");
		System.out.println("5. Decathlon Long Jump. (Measured in centimeters)");
		System.out.println("6. Decathlon High Jump. (Measured in centimeters)");
		System.out.println("7. Decathlon Pole Vault. (Measured in centimeters)");
		System.out.println("8. Decathlon Discus Throw. (Measured in meters)");
		System.out.println("9. Decathlon Javelin Throw. (Measured in meters)");
		System.out.println("10. Decathlon Shot Put. (Measured in meters)");
		System.out.println("11. Heptathlon 200 meters.");
		System.out.println("12. Heptathlon 800 meters.");
		System.out.println("13. Heptathlon 100 meters hurdles.");
		System.out.println("14. Heptathlon High Jump.");
		System.out.println("15. Heptathlon Long Jump.");
		System.out.println("16. Heptathlon Shot Put.");
		System.out.println("17. Heptathlon Javelin Throw.");
		System.out.println("18. Exit program and show results.");

	}

}