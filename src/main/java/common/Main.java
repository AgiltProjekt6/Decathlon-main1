package common;

public class Main {

	public static String name;

	public static void main(String[] args) {
		boolean choice = true;

		//while (choice = true) {
			InputName inputName = new InputName();
			inputName.addCompetitor();
			name = inputName.getCompName();

			SelectDiscipline selectDiscipline = new SelectDiscipline();
			selectDiscipline.inputSelection();

		//}
		choice = false;
	}
}
