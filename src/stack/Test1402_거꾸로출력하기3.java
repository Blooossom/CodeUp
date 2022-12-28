package stack;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test1402_거꾸로출력하기3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            stack.push(Integer.parseInt(st.nextToken()));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop()).append(' ');
        }
        System.out.println(sb);
    }
}
