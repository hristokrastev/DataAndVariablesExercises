package Java_fund_second_couse.DatatypesAndVariablesExercises;

import java.util.Scanner;

public class PrintPartOfAsciiTable {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int startChar = Integer.parseInt(console.nextLine());

        int lastChar = Integer.parseInt(console.nextLine());

        for (int firstLetter = startChar; firstLetter < lastChar; firstLetter++) {
            System.out.print((char)firstLetter + " ");

        }
        System.out.println((char)lastChar);
    }
}
