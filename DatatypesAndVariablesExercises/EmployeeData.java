package Java_fund_second_couse.DatatypesAndVariablesExercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstName = console.nextLine();
        String lastName = console.nextLine();
        String age = console.nextLine();
        String gender = console.nextLine();
        String id = console.nextLine();
        int employeeNumber = Integer.parseInt(console.nextLine());

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal ID: " + id);
        System.out.println("Unique Employee number: " + employeeNumber);

    }
}
