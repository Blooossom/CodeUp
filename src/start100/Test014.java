package start100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float inp = Float.parseFloat(br.readLine());
        System.out.println(String.format("%.2f",inp));
    }
}
