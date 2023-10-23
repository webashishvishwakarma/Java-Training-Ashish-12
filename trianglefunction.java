import java.util.*;

public class trianglefunction {
    public static int triangle(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("equilateral triaangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("isoscelus triangle");
        } else {
            System.out.println("sclene triangle");
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int triangle = triangle(a, b, c);
        System.out.println("output" + (triangle));

    }

}
