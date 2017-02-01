package Java_fund_second_couse.DatatypesAndVariablesExercises;

import java.util.Scanner;

public class ExchangeVariableValues {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int olda = Integer.parseInt(console.nextLine());
        int oldb = Integer.parseInt(console.nextLine());

        int newa = oldb;
        int newb = olda;

        System.out.println("Before:");
        System.out.println("a = " + olda);
        System.out.println("b = " + oldb);
        System.out.println("After:");
        System.out.println("a = " + newa);
        System.out.println("b = " + newb);
    }
}
