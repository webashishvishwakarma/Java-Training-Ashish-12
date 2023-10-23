import java.util.*;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = 19;
        int temp = 0;
        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.print("not a prime");
        } else {
            System.out.print("prime");
        }
    }

}
