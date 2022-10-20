package common;

public class CalcTrackAndField {

	private int result;

	// Calculates height and distance for field discipline.

	// Beräknar ett resultat för DecaDiscusThrow, DecaHighJump, DecaJavelinThrow,DecaLongJump, DecaPoleVault, DecaShotPut, HeptHighJump, HeptJavelinThrow, HeptLongJump, HeptShotPut

	public int calculateField(double A, double B, double C, double distance) {
		result = (int) (A * Math.pow((distance - B), C));
		return result;

	}

	// Calculates height and distance for track discipline.

	// Beräknar ett resultat för deca100M, deca110Mhurdles, Deca400M, Deca1500M, Hep100Mhurdles, Hep200M, Hep800M
	public int calculateTrack(double A, double B, double C, double distance) {
		result = (int) (A * Math.pow((B - distance), C));
		return result;

	}

}
