package challenge_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<String> words = new ArrayList<String>();

        while (testCases > 0) {
            String pattern = in.nextLine();
            words.add(pattern);
            testCases--;
        }
        in.close();

        for (int i = 0; i < words.size(); i++) {
            try {
                Pattern.compile(words.get(i));
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }

    }
}
