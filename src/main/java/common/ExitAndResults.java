package common;

import java.util.Scanner;

public class ExitAndResults {

    public void ExitAndShowResults() {
        Scanner sc = new Scanner(System.in);
        Main getInputName = new Main();
        System.out.println("\nThank you for using our calculator, here's the results for the competitor named: " + getInputName.name + "\n");

    }

}
