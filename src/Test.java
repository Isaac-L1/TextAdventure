import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        long now = System.nanoTime();
        Arrays.fill(array, 0);
        long time_taken = System.nanoTime() - now;
        System.out.println(time_taken);
    }
}
