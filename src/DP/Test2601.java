package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test2601 {
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new long[N + 1];
        System.out.println(Fibonacci(N));

    }
    static long Fibonacci(int n){
        if (n == 1 || n == 2) {
            return dp[n] = 1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }else {
            return dp[n] = Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
