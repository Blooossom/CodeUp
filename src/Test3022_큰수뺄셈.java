import java.io.*;
import java.math.BigInteger;
public class Test3022_큰수뺄셈 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        System.out.println(a.subtract(b));
    }
}
