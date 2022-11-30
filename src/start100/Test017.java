package start100;
import java.io.*;
import java.util.StringTokenizer;

public class Test017 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),".");
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        System.out.printf("%04d.%02d.%02d",y,m,d);
    }
}
