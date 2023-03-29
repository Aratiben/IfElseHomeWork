import java.util.Scanner;

public class InterChangedValue {                               //class name
    public static void main(String[] args) {
        ValueChange();
    }   //calling method in to main method

    public static void ValueChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type first number");   //printing message
        int A = scanner.nextInt();       //variable to hold the value
        System.out.println("please type second number");   //printing message
        int B = scanner.nextInt();    //variable to hold the value
        int C = A;                 //created third variable to change the value
        A = B;     // changing the value
        B = C;     //changing the value
        System.out.println("after swapping ");    //printing message
        System.out.println("first number " + A);   //first number
        System.out.println("second number is " + B);  //second number
    }
}
