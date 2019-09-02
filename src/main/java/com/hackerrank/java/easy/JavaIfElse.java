package com.hackerrank.java.easy;

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        System.out.println(ifElseSolution(N));
    }

    public static String ifElseSolution(int n) {
        if(n % 2 != 0) {
            return "Weird";
        }
        else if(n >= 2
                && n <= 5) {
            return "Not Weird";
        }
        else if(n >= 6
                && n <= 20) {
            return "Weird";
        }
        else {
            return "Not Weird";
        }
    }
}
