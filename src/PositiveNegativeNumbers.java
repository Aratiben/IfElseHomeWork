import java.util.Scanner;

public class PositiveNegativeNumbers {

    public static void main(String[] args) {
        result();
    }

    public static void result() {
        Scanner scanner = new Scanner(System.in);        //using inbuilt method
        System.out.println("Please input any number");   //printing message
        int digits = scanner.nextInt();
        if (digits > 0) {                   //conditions
            System.out.println("its positive Number");
        } else if (digits < 0) {               //conditions
            System.out.println("its Negative Number");
        } else {
            System.out.println("its zero");
        }   //if above both conditions does not match then

    }
}

