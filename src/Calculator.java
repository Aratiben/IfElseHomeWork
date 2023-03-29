import java.util.Scanner;

public class Calculator {       //class name
    public static void maths() {                                   //method name
        Scanner scanner = new Scanner(System.in);                // using inbuilt class
        System.out.print("Please type First number: ");         //printing message
        int A = scanner.nextInt();                              //input int
        System.out.print("Please type the Second number: ");
        int B = scanner.nextInt();
        System.out.print("Please type any Symbol from (-,+,/,*): ");
        char symbol = scanner.next().charAt(0);
        double c = 0;

        if (symbol == '+') {                            // symbol +
            c = A + B;
        } else if (symbol == '-') {                   // symbol -
            c = A - B;
        } else if (symbol == '/') {                   // symbol /
            c = A * 1.0 / B;
        } else {                                    // symbol *
            c = A * B;
        }
        System.out.println("Result: " + c);
    }

    public static void main(String[] args) {
        maths();
    }
}
