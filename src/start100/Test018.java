package start100;
import java.io.*;
import java.util.StringTokenizer;

public class Test018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int front = Integer.parseInt(st.nextToken());
        int back = Integer.parseInt(st.nextToken());
        System.out.printf("%06d%07d",front,back);
    }
}
