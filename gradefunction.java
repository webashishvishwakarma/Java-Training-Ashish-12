import java.util.*;

public class gradefunction {
    public static int grade(int n) {
        if (n >= 90) {
            System.out.println("grade A");
        } else if (n > 70 && n <= 89) {
            System.out.println("grade B");
        } else if (n > 50 && n <= 70) {
            System.out.println("grade C");
        } else {
            System.out.println("grade D");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int result = grade(n);
        System.out.println("o/p result" + (result));

    }

}
