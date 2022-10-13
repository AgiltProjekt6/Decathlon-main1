package common;

import decathlon.Deca100M;
import io.cucumber.java.bs.A;
import org.apache.batik.css.engine.value.Value;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTrackAndFieldTest {

    // declathon
    @Test
    public void calculateFieldTest() {

        double A = 12.91;
        double B = 4;
        double C = 1.1;
        double testinput = 15;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateField(A,B,C,testinput);
        assertEquals(180,Result);

    }

    // hepthlaton
    @Test
    public void calculateTrackTest() {

        double A = 25.4347;
        double B = 18;
        double C = 1.81;
        double testinput = 15;
        int Result;

        CalcTrackAndField calc = new CalcTrackAndField();
        Result = calc.calculateTrack(A,B,C,testinput);
        assertEquals(185,Result);

    }

}