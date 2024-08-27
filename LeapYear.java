import java.util.Scanner;

public class LeapYear {
    private static boolean isleapyear(int year){
        return year%400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(isleapyear(year)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
