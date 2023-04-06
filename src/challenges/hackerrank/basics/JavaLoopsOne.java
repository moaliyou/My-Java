package src.challenges.hackerrank.basics;

import java.io.*;

public class JavaLoopsOne {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, (N * i));
        }

        bufferedReader.close();

    }

}
