package common;

import decathlon.Deca100M;
import io.cucumber.java.bs.A;
import org.apache.batik.css.engine.value.Value;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTrackAndFieldTest {

    @Test
    public void calculateDecaDiscThrow() {

        double A = 12.91;
        double B = 4;
        double C = 1.1;
        double testinput = 15;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A, B, C, testinput);
        assertEquals(180, Result);

    }

    @Test
    public void calculateDeca100M() {

        double A = 25.4347;
        double B = 18;
        double C = 1.81;
        double testinput = 15;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateTrack(A, B, C, testinput);
        assertEquals(185, Result);

    }

    @Test
    public void calculateDecaLongJump() {

        double A = 0.14354;
        double B = 220;
        double C = 1.4;
        double testinput = 500;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A, B, C, testinput);
        assertEquals(382, Result);
    }

    @Test
    public void calculateDecaShotPut() {

        double A = 51.39;
        double B = 1.5;
        double C = 1.05;
        double testinput = 15;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A,B,C,testinput);
        assertEquals(790,Result);
    }

    @Test
    public void calculateDecaHighJump () {

        double A = 0.8465;
        double B = 75;
        double C = 1.42;
        double testinput = 167;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A,B,C,testinput);
        assertEquals(520,Result);

    }

    @Test
    public void calculateDeca400M () {

    double A = 1.53775;
    double B = 82;
    double C = 1.81;
    double testinput = 50;
    int Result;

    CalcTrackAndField calc = new CalcTrackAndField();
    Result = calc.calculateTrack(A,B,C,testinput);
    assertEquals(815,Result);

    }

    @Test
    public void calculateDeca110MHurdles () {

        double A = 5.74352;
        double B = 28.5;
        double C = 1.92;
        double testinput = 20;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateTrack(A,B,C,testinput);
        assertEquals(349,Result);

    }

    @Test
    public void calculateDecaPoleVault () {

        double A = 0.2797;
        double B = 100;
        double C = 1.35;
        double testinput = 434;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A,B,C,testinput);
        assertEquals(714,Result);

    }

    @Test
    public void calculateDecaJavelinThrow () {

        double A = 10.14;
        double B = 7;
        double C = 1.08;
        double testinput = 74;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A,B,C,testinput);
        assertEquals(951,Result);

    }

    @Test
    public void calculateDeca1500M () {

        double A = 0.03768;
        double B = 480;
        double C = 1.85;
        double testinput = 3.5;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateTrack(A,B,C,testinput);
        assertEquals(3392,Result);

    }

    @Test
    public void calculateHeptHighJump() {

        double A = 1.84523;
        double B = 75;
        double C = 1.348;
        double testinput = 165.7;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A, B, C, testinput);
        assertEquals(803, Result);
    }

    @Test
    public void calculateHeptJavelinThrow() {

        double A = 15.9803;
        double B = 3.8;
        double C = 1.04;
        double testinput = 48;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A, B, C, testinput);
        assertEquals(821, Result);

    }

    @Test
    public void calculateLongJump() {

        double A = 0.188807;
        double B = 210;
        double C = 1.41;
        double testinput = 300;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A, B, C, testinput);
        assertEquals(107, Result);

    }

    @Test
    public void calculateShotPut() {

        double A = 56.0211;
        double B = 1.5;
        double C = 1.05;
        double testinput = 37;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A, B, C, testinput);
        assertEquals(2377, Result);

    }

    @Test
    public void calculateHept100MHurdles() {

        double A = 9.23076;
        double B = 26.7;
        double C = 1.835;
        double testinput = 17;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateTrack(A, B, C, testinput);
        assertEquals(596, Result);

    }

    @Test
    public void calculateHep200M() {

        double A = 4.99087;
        double B = 42.5;
        double C = 1.81;
        double testinput = 35;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateTrack(A, B, C, testinput);
        assertEquals(191, Result);

    }

    @Test
    public void calculateHep800M() {

        double A = 0.11193;
        double B = 254;
        double C = 1.88;
        double testinput = 150;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateTrack(A, B, C, testinput);
        assertEquals(693, Result);

    }
}
