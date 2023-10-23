import java.util.*;

public class simpleinterest {
    public static int si(int a, int b, int c) {
        int si = (a * b * c) / 100;
        return si;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int si = si(a, b, c);
        System.out.print("simple interest" + (si));
    }
}
