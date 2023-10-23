import java.util.*;

public class functionsalary {
    public static float salary(float basic, float allowances) {
        float hr, da, tr, net_salary;
        hr = (basic * 30) / 100;
        da = (basic * 20) / 100;
        tr = (basic * 10) / 100;
        net_salary = basic + allowances - 1400;

        return net_salary;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic");
        float basic = sc.nextFloat();
        System.out.println("enter the allowances");
        float allowances = sc.nextFloat();
        System.out.println("enter the net_salary");
        float salary = salary(basic, allowances);
        System.out.println("o/p salart" + (salary));

    }

}
