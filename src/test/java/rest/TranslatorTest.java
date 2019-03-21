package rest;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TranslatorTest {

    @Test
    public void translateTest() throws IOException {
        String translatedText = Translator.translate("hello world");

        assertEquals("Привет мир", translatedText);
    }
}