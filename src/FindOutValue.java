import java.util.Scanner;

public class FindOutValue {  //class name
    public static void Value() {            // Method name
        Scanner scanner = new Scanner(System.in);  //scanner inbuilt class using to input the value
        System.out.print("please type any character: ");
        char ch = scanner.next().charAt(0);
        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) { // checking the value
            System.out.println("character is Alphabet");    //printing message
        } else if (ch >= 48 && ch <= 57) {   //checking value
            System.out.println("character is Number");
        }                                    //print the message
        else
            System.out.println("Special Character");
    }

    public static void main(String[] args) {              // main method
        Value();
    }
}