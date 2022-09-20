package common;

public class CalcTrackAndField {

	private int result;

	// Calculates height and distance for field discipline.

	// Beräknar ett resultat baserat på höjd och distans för DeaDiscusThrow, DecaHighJump, DecaJavelinThrow,DecaLongJump, DecaPoleVault, DecaShotPut
	public int calculateField(double A, double B, double C, double distance) {
		result = (int) (A * Math.pow((distance - B), C));
		return result;
	}

	// Calculates height and distance for track discipline.

	// Beräknar ett resultat baserat på höjd och distans för deca100M, deca110Mhurdles, Deca400M, Deca1500M.
	public int calculateTrack(double A, double B, double C, double distance) {
		result = (int) (A * Math.pow((B - distance), C));
		return result;
	}

}
