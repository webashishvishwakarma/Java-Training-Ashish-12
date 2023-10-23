import java.util.*;

public class leapyearfunction {
    public static int leapyear(int n) {
        if (n % 4 == 0 || n % 400 == 0 && n % 100 != 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int leapyear = leapyear(n);
        System.out.println("leap" + (leapyear));
    }

}
