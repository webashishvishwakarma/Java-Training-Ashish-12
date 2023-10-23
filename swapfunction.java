import java.util.*;

public class swapfunction {
    public static int swap(int a, int b) {
        a = 10;
        b = 20;
        a = a + b;
        b = a - b;
        a = a - b;

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int swap = swap(a, b);
        System.out.println("after swapping" + (a));
        System.out.println("after swapping " + (b));

    }

}
