package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "\\|(?<boss>[A-Z]{4,})\\|\\:\\#(?<title>[A-Za-z]+\\s[A-Za-z]+)\\#";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            matcher = pattern.matcher(input);

            if (!matcher.find()){
                System.out.println("Access denied!");
            }else {
                int strength = matcher.group("boss").length();
                int armor = matcher.group("title").length();
                System.out.printf("%s, The %s%n>> Strength: %d%n>> Armor: %d%n", matcher.group("boss"), matcher.group("title"), strength, armor);
            }
        }
    }
}
