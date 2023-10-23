import java.util.*;

public class positivenegativefunction {
    public static int positivenegative(int n) {
        if (n > 0) {
            System.out.println("positive no.");
        } else {
            System.out.println("negative");
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = positivenegative(n);
        // System.out.println("result" +(result));
    }

}
