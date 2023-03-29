import java.util.Scanner;

public class calculater {       //class name

    public static void maths() {                                   //method name
        Scanner scanner = new Scanner(System.in);                // using inbuilt class
        System.out.println("please type first number");         //printing message
        int A = scanner.nextInt();                              //input int
        System.out.println("please type the second number");
        int B = scanner.nextInt();
        System.out.println("please type any symbol from (-,+,/,*)");
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
        System.out.println(c);
    }

    public static void main(String[] args) {
        maths();
    }
}
