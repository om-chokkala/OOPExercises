import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write something: ");
        String input = scanner.nextLine();
        Set<Character> uniqueChar = storeUniqueChar(input);
        System.out.println("The number of characters: "+input.length());
        System.out.println("The number of unique characters: "+uniqueChar.size());
    }

    private static Set<Character> storeUniqueChar(String input) {
        Set<Character> uniqueChar= new HashSet<>();
        for (char c: input.toCharArray()) {
            uniqueChar.add(c);
        }
        return uniqueChar;
    }
}
