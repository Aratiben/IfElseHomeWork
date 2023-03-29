import java.util.Scanner;

public class LeapYear {

    public void CheckLeapYear() {
        Scanner scanner = new Scanner(System.in);  // import scanner

        System.out.println("please type the Year");   // year
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println("this Year is leap year"); // printing leap year

        } else {
            System.out.println("This year is not leap year");   // printing not leap year
        }
    }

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();    // creat object
        leapYear.CheckLeapYear();  //
    }
}
