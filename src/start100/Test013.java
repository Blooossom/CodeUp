package start100;
import java.io.*;
import java.util.StringTokenizer;

public class Test013 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char ch1 = st.nextToken().charAt(0);
        char ch2 = st.nextToken().charAt(0);
        System.out.println(ch2+" "+ch1);
    }
}
