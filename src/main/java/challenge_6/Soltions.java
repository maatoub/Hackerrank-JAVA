package challenge_6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Soltions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        Pattern pattern = Pattern.compile("[\\p{Punct}\\s]+"); // reg for delete espaces and punctuation
        s = s.replaceAll(pattern.pattern(), "\n");

        String[] words = s.split("\n");
        int count = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
    }
}