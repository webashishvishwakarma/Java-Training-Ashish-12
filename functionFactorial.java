import java.util.*;

public class functionFactorial {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
            System.out.print(factorial);
        }
        return factorial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.print("factorial" + (factorial));

    }

}
