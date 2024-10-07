package challenge_4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        String str1 = line.substring(0, line.length());
        String str2 = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            str2 += Character.toString(line.charAt(i));
        }
        System.out.println(str2.compareTo(str1) == 0 ? "Yes" : "No");
    }
}