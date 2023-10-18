import java.util.*;

public class factorialfunction {
    public static int findfac(int n) {
        int fac = 1;
        for (int i = n; i >= 1; i--)
            fac = fac * i;
        System.out.println(fac);
        return fac;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = findfac(n);

        System.out.println(fac);

    }

}
