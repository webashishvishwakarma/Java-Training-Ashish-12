import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float basic, HRA, TA, DA, allowances, net_salary;

        System.out.println("enter the basic salary");
        basic = sc.nextFloat();

        System.out.println("enter allowance");
        allowances = sc.nextFloat();
        System.out.println("net_salary");
        DA = (basic * 20) / 100;
        HRA = (basic * 30) / 100;
        TA = (basic * 10) / 100;

        net_salary = (basic + allowances - 1400);
        System.out.println("output of company" + (net_salary));

    }
}
