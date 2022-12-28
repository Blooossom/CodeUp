package stack;
import java.io.*;
import java.util.Stack;

public class Test2016_천단위구분기호 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            stack.push(str.charAt(i));
        }
        int comma = 1;
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (comma == 3 && !stack.isEmpty()) {
                sb.append(',');
                comma = 0;
            }

            comma++;
        }
        System.out.println(sb.reverse());
    }
}
