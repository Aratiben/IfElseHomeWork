import java.util.Scanner;

public class SevenDaysOfWeek {
    public static void main(String[] args) {
   Week();
    }

    public static void Week() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type any numbers");  //asking to type the numbers
        int numbers = scanner.nextInt();
        if (numbers == 1) {  //taking the value
            System.out.println("Today is Monday");  // printing monday
        } else if (numbers == 2) {
            System.out.println("Today is Tuesday");  //printing tuesday
        } else if (numbers == 3) {
            System.out.println("Today is Wednesday");///printing wednesday
        } else if (numbers == 4) {
            System.out.println("Today is Thursday");///printing thursday
        } else if (numbers == 5) {
            System.out.println("Today is Friday");///printing friday
        } else if (numbers == 6) {
            System.out.println("Today is Saturday");///printing saturday
        } else if (numbers==7) {
            System.out.println("Today is Sunday");///printing sunday

        }
        else {
            System.out.println("Invalid Numbers");  //number is above 7 entry is invalid
        }

    }
}
