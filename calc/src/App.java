package calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] args) {
        int operator, n1, n2;
        System.out.println("1- Add \n2 - Subtract \n3- Multiply \n4 - Divide");
        System.out.println("Choose operator ");
        Scanner sc = new Scanner(System.in);
        
        try {
            operator = sc.nextInt();
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
            sc.close();
            return; // Exit the program to prevent further execution
        }

        int result = 0;
        switch (operator) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                    sc.close();
                    return; // Exit the program to prevent displaying incorrect result
                }
                break;
            default:
                System.out.println("Error: Operator is not valid");
        }
        
        System.out.println("Result: " + result);
        sc.close();
    }
}