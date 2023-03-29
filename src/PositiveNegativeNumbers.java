import java.util.Scanner;

public class PositiveNegativeNumbers {

    public static void main(String[] args) {
        result();
    }

    public static void result() {
        Scanner scanner = new Scanner(System.in);        //using inbuilt method
        System.out.print("Please input any Number: ");   //printing message
        int digits = scanner.nextInt();
        if (digits > 0) {                   //conditions
            System.out.println("Its Positive Number");
        } else if (digits < 0) {               //conditions
            System.out.println("Its Negative Number");
        } else {
            System.out.println("Its Zero");
        }   //if above both conditions does not match then

    }
}

