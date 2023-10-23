import java.util.*;

public class averagefunction {
    public static float average(float a, float b, float c) {
        float average = (a + b + c) / 3;
        return average;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float average = average(a, b, c);
        System.out.println("average of three no." + (average));
    }

}
