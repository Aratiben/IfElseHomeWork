import java.util.Scanner;

public class CityName {

    public static void name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type any alphabet in Uppercase from (A,B,C,D,F): ");
        char Name = scanner.next().charAt(0);          //inbuilt method

        if (Name == 'A') {                         // alphabet
            System.out.println("Amdavad");        // city name
        } else if (Name == 'B') {                    //alphabet
            System.out.println("Baroda");       // city name
        } else if (Name == 'C') {                    // alphabet
            System.out.println("Canada");           // city name
        } else if (Name == 'D') {                  //alphabet
            System.out.println("Dilhi");        //city name
        } else if (Name == 'E') {
            System.out.println("Egypt");
        } else if (Name == 'F') {
            System.out.println("France");

        } else {
            System.out.println("Invalid Entry");   // if alphabet is not from A-F then its invalid
        }
    }

    public static void main(String[] args) {            // main method
        name();
    }
}

