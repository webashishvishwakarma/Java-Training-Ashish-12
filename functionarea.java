import java.util.*;

public class functionarea {
    public static int area(int a, int b) {
        int area = a * b;
        return area;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = area(a, b);
        System.out.print("area of rectangle" + (area));
    }

}
