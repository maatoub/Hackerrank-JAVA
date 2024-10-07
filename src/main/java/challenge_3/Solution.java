package challenge_3;

import java.util.Scanner;

public class Solution {

    /*
     * hello => he-el-ll-lo
     * 
     * 
     */

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String subString = s.substring(i, i + k);

            if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            }
            if (subString.compareTo(largest) > 0) {
                largest = subString;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println("--------------------Result--------------------");
        System.out.println(getSmallestAndLargest(s, k));
    }
}