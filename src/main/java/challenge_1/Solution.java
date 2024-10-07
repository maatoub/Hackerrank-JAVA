package challenge_1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int length = A.length() + B.length();
        System.out.println(length);
        int res = A.compareTo(B);
        System.out.println(res <= 0 ? "No" : "Yes");
        String newA = A.toUpperCase().charAt(0) + A.substring(1, A.length());
        String newB = B.toUpperCase().charAt(0) + B.substring(1, B.length());

        System.out.println(newA + " " + newB);
        scanner.close();
    }
}
