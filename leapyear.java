public class leapyear {
    public static void main(String[] args) {
        int year=2017;
        if(year%4==0 || year%400==0 && year%100 !=0){
            System.out.print("year is a leap year");
        }
        else{
            System.out.print("not  leap year");
        }
    }
    
}
