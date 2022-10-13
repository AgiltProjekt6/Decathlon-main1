package common;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.Assert.*;

public class InputNameTest {

    @Test
    public void addCompetitorNameWorking() {

        InputName testInput = new InputName();

        String CompetitorName = "johan";
        InputStream in = new ByteArrayInputStream(CompetitorName.getBytes());
        System.setIn(in);
        assertEquals("johan", testInput.addCompetitor());

    }

    @Test
    public void addCompetitorNameNotWorking() {

        InputName testInput = new InputName();

        String CompetitorName = "johan10";
        InputStream in = new ByteArrayInputStream(CompetitorName.getBytes());
        System.setIn(in);
        assertEquals("johan", testInput.addCompetitor());


    }
}