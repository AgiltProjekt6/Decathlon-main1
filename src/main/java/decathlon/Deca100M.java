package decathlon;

import common.*;
import net.bytebuddy.asm.Advice;

public class Deca100M {

	public int finalScore;

	private int score;
	private double A = 25.4347;
	private double B = 18;
	private double C = 1.81;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on time. All running events.
	public void calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				if (runningTime < 5) {
					System.out.println("Value too low");
					runningTime = inputResult.enterResult();
				} else if (runningTime > 17.8) {
					System.out.println("Value too high");
					runningTime = inputResult.enterResult();
				} else {

					score = calc.calculateTrack(A, B, C, runningTime);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");

			}
		}

		SelectDiscipline selectDiscipline = new SelectDiscipline();
		selectDiscipline.inputSelection();
		finalScore = score;
		System.out.println("The result for Deca100M is " + finalScore);

	}

}
