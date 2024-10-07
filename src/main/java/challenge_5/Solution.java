package challenge_5;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        int str1 = a.length();
        int str2 = b.length();
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayB);
        Arrays.sort(arrayA);
        if (str1 == str2) {
            if (Arrays.equals(arrayA, arrayB)) {
                return true;
            }
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
