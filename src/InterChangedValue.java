import java.util.Scanner;

public class InterChangedValue {                               //class name
    public static void main(String[] args) {
        ValueChange();
    }   //calling method in to main method

    public static void ValueChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type First number: ");   //printing message
        int A = scanner.nextInt();       //variable to hold the value
        System.out.print("Please type Second number: ");   //printing message
        int B = scanner.nextInt();    //variable to hold the value
        int C = A;                 //created third variable to change the value
        A = B;     // changing the value
        B = C;     //changing the value
        System.out.println("After Swapping ");    //printing message
        System.out.println("First Number: " + A);   //first number
        System.out.println("Second Number: " + B);  //second number
    }
}
