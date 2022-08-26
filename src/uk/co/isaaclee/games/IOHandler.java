package uk.co.isaaclee.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOHandler {

    public static final String NEW_PARAGRAPH = "------------";

    private BufferedReader bufferRead;

    public IOHandler() {
        bufferRead = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getInput(String prompt) {
        System.out.println(IOHandler.NEW_PARAGRAPH);
        System.out.println(prompt);
        String input = "";
        try {
            input = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
