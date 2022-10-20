package common;

import org.apache.xmlbeans.soap.SOAPArrayType;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


class SelectDisciplineTest {

    @Test
    void inputSelection()  {

        SelectDiscipline test = new SelectDiscipline();

        test.inputSelection();

    }
}