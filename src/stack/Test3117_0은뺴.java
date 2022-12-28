package stack;
import java.io.*;
import java.util.Stack;

public class Test3117_0은뺴 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            int p = Integer.parseInt(br.readLine());
            if (p == 0) {
                stack.pop();
            } else {
                stack.push(p);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
