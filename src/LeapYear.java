import java.util.Scanner;

//WAP to input any year like 1989 and find out if it is leap year
public class LeapYear {

    public void CheckLeapYear() {
        Scanner scanner = new Scanner(System.in);  // import scanner

        System.out.print("Please type the Year: ");   // year
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println("This Year is Leap year"); // printing leap year
        } else {
            System.out.println("This year is not Leap year");   // printing not leap year
        }
    }

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();    // creat object
        leapYear.CheckLeapYear();  //
    }
}
