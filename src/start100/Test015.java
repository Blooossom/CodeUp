package start100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ")
                .append(a).append(" ")
                .append(a);
        System.out.println(sb);
        br.close();
    }
}
