package Java_fund_second_couse.DatatypesAndVariablesExercises;

import java.util.Scanner;

public class FirstPrimeChecker {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int input = Integer.parseInt(console.nextLine());

        for (int first = 2; first <= input; first++) {

            boolean Case = true;

            String caseStringT = "True";
            String caseStringF = "False";

            for (int second = 2; second <= Math.sqrt(first); second++) {

                if (first % second == 0) {
                    Case = false;
                    break;
                }

            }
            if (Case == true){
                System.out.print(first + " -> ");
                System.out.println(caseStringT);
            }
            else {
                System.out.print(first + " -> ");
                System.out.println(caseStringF);
            }





        }
    }


}

