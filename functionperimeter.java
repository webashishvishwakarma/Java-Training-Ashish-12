import java.util.*;

public class functionperimeter {
    public static int perimeter(int a, int b)
    // public static int area(int a, int b)

    {
        int perimeter = 2 * (a + b);
        // int area = a*b;
        return perimeter;
        // return area;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int perimeter = perimeter(a, b);
        // int area = area (a,b);
        System.out.print("perimeter of rectangle" + (perimeter));
        // System.out.print("area of rectangle" +(area));
    }

}
