import java.util.*;

public class printprimefunction {
    public static int printprime(int n) {
        int temp = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println(" not a prime");
        } else {
            System.out.println(" prime");
        }
        // System.out.print(n);
        return (n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = printprime(n);
        System.out.print(result);
    }

}
