import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    private BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

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

    public static void main(String[] args) {

        Test test = new Test();
        String hey = test.getInput("Enter a number:");
        System.out.println(hey);
    }
}
