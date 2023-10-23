import java.util.*;

public class dayfunction {
    public static int dayweek(int n) {

        // char day = 0;
        // char op; = sc.next().charAt(0);
        switch (n) {
            case 1:
                System.out.print("monday");
                break;
            case 2:
                System.out.print("tuesday");
                break;
            case 3:
                System.out.print("wednesday");
                break;
            case 4:
                System.out.print("thurday");
                break;
            case 5:
                System.out.print("friday");
                break;
            case 6:
                System.out.print("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not a valid day");

        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day");
        int n = sc.nextInt();
        // char operator = sc.next().charAt(0);

        int result = dayweek(n);
        System.out.println("o/p of the result" + (result));

    }

}
