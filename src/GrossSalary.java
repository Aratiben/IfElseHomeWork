import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {         //main method
        salary();                                   //calling method in to main method
    }

    public static void salary() {
        Scanner scanner = new Scanner(System.in);    //inbuilt method
        System.out.print("Please input your ID: ");//taking deta
        String id = scanner.nextLine();
        System.out.print("Please type your Name: ");    //name
        String name = scanner.nextLine();
        System.out.print("Please input your Basic Salary: ");//     salary
        int salary = scanner.nextInt();
        int HRA = (salary * 10) / 100;   // counting HRA
        int TA = (salary * 9) / 100;      // counting TA
        int PF = (salary * 20) / 100;     // counting PF
        int DA = (salary * 8) / 100;       //counting DA
        System.out.println("HRA is = " + (salary * 10) / 100);    //printing message
        System.out.println("TA is = " + (salary * 9) / 100);     // printing message
        System.out.println("PF is = " + (salary * 20) / 100);
        System.out.println("Your DA is =" + (salary * 8) / 100);
        System.out.println("Your Gross Salary is = " + (salary + HRA + TA + DA - PF));//total gross salry
    }
}
