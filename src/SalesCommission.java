import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        commission();
    }

    public static void commission() {
        Scanner scanner = new Scanner(System.in);      //using inbuilt method
        System.out.print("Please input  ID: ");     //taking id
        String ID = scanner.nextLine();
        System.out.print("Please enter Seller's Name: ");  //name
        String Name = scanner.nextLine();
        System.out.print("Please input Sales Amount: "); //sales amount
        int amount = scanner.nextInt();
        System.out.print("Please input Basic Salary: ");   //salary
        int salary = scanner.nextInt();
        if (amount >= 50000) {
            System.out.println("You will get " + (amount * 35) / 100 + "  commission");//counting commission
        } else if (amount >= 30000) {
            System.out.println("You will get " + (amount * 20) / 100 + "  commission");//counting commission
        } else if (amount >= 20000) {
            System.out.println("You will get " + (amount * 10) / 100 + "  commission");//counting commission
        } else if (amount >= 10000) {
            System.out.println("You will get " + (amount * 5) / 100 + "  commission");//counting commission
        } else {
            System.out.println("You will get " + (amount * 2) / 100 + "  commission");//counting commission
        }
    }
}
