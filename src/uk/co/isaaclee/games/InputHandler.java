package uk.co.isaaclee.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {

    private BufferedReader bufferRead;

    public InputHandler() {
        bufferRead = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getInput(String prompt) {
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
