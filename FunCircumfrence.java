import java.util.*;

public class FunCircumfrence {
    public static double circum(double r) {
        double circum = 2 * 3.14 * r;
        return circum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double circum = circum(r);
        System.out.println("circumfrence" + (circum));
    }

}
