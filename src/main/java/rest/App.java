package rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Scanner;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String sourceText = scanner.nextLine();
            String translatedText = Translator.translate(sourceText);

            System.out.println(translatedText);
        } catch (IOException e) {
            logger.error(e.toString());
        }
    }
}
