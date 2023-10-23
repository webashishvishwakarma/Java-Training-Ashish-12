import java.util.*;

public class gretestoftwofunction {
    public static int gretest(int a, int b) {
        if (a >= b) {
            System.out.print(a);

        } else {
            System.out.print(b);
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the greatest no.");
        int gretest = gretest(a, b);
        // System.out.println("the number" + (gretest));
    }

}
