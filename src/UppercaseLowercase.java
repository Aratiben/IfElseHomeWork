import java.util.Scanner;

public class UppercaseLowercase {
    public static void uppercase() {
        Scanner scanner = new Scanner(System.in);  //import Scanner
        System.out.print("Please type any value in Uppercase: ");//typing value
        String Lowercase = scanner.nextLine();
        String result;
        result = Lowercase.toLowerCase();// chnaging the values in lowercase

        System.out.println(result);  //final result
    }
    public static void main(String[] args) {
        uppercase();
    }
}
