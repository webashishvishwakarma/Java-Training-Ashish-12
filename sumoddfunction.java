import java.util.*;

public class sumoddfunction {
    public static int sumodd(int n, int l) {
        int a = 1;
        int sumodd = (n) * (a + l) / 2;
        return sumodd;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int sumodd = sumodd(n, l);
        System.out.println("sum of odd no to n" + (sumodd));

    }

}
