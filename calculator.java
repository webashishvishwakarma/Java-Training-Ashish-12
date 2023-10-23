import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("enter the operator");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.println("sum of two number" + (a + b));
                break;

            case '-':
                System.out.println("difference" + (a + b));
                break;

            case '*':
                System.out.println("multiply" + (a * b));
                break;

            case '/':
                System.out.println("division" + (a / b));
                break;
            default:
                System.out.println("invalid operator");
        }

    }

}
