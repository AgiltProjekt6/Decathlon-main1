package common;

import static org.junit.Assert.*;
import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;

public class InputResultTest {


    @Test
    public void enterResultTest() {

        InputResult inputTest = new InputResult();

        String choice = "10.5";
        InputStream in = new ByteArrayInputStream(choice.getBytes());
        System.setIn(in);
        assertEquals(10.5,inputTest.enterResult(),0);


    }
}