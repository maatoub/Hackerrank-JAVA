package challenge_2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String res = S.substring(start, end);
        System.out.println(res);
        in.close();
    }
}