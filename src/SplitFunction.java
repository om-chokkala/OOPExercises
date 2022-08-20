/*
import java.util.Scanner;

public class SplitFunction {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(":");
        String[] nameAndNumber;
        int age;
       // ulf 48 : max 68 : eva 99
        for (String s: array) {
            nameAndNumber = s.trim().split(" ");
            System.out.println("Name " + nameAndNumber[0]);
            age = Integer.parseInt(nameAndNumber[1]);
            System.out.println("Age " + age);
        }

    }
}
*/


import java.util.Arrays;

public class SplitFunction {
    public static void main(String args[]) {
        String str = "geeks@for@geeks@geeks@for@geeks";
        String[] arrOfStr;

        arrOfStr = str.split("@", 2);
        System.out.println(Arrays.toString(arrOfStr));

        arrOfStr = str.split("@", 5);
        System.out.println(Arrays.toString(arrOfStr));

        arrOfStr = str.split("s", 5);
        System.out.println(Arrays.toString(arrOfStr));

        arrOfStr = str.split("@", -2);
        System.out.println(Arrays.toString(arrOfStr));

        arrOfStr = str.split("s", -2);
        System.out.println(Arrays.toString(arrOfStr));

        arrOfStr = str.split("s", 0);
        System.out.println(Arrays.toString(arrOfStr));

        arrOfStr = str.split("@", 0);
        System.out.println(Arrays.toString(arrOfStr));
    }
}