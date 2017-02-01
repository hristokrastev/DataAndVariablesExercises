package Java_fund_second_couse.DatatypesAndVariablesExercises;

import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int input = Integer.parseInt(console.nextLine());

        String Hex=  Integer.toHexString(input);

        String Binary = Integer.toBinaryString(input);



        System.out.println(Hex.toUpperCase());
        System.out.println(Binary.toUpperCase());
    }
}
