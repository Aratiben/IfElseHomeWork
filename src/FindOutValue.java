import java.util.Scanner;

public class FindOutValue {  //class name
    public static void Value() {            // Method name
        Scanner scanner = new Scanner(System.in);  //scanner inbuilt class using to input the value
        System.out.println("please type any value");
        char ch = scanner.next().charAt(0);
        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) { // checking the value
            System.out.println("character is alphabet");    //printing message
        } else if (ch >= 48 && ch <= 57) {   //checking value
            System.out.println("character is number");
        }                                    //print the message
        else
            System.out.println("special character");
    }

    public static void main(String[] args) {              // main method
        Value();
    }
}