import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {            //main method
        Vote();

    }
    public static void Vote() {                        //method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your age");       //input age
        int Age = scanner.nextInt();                 // giving the variable to hold the value

        if (Age >= 18) {
            System.out.println("You are Eligible to vote");   //printing message
        } else {
            System.out.println("You are not Eligible to Vote"); //message
        }
    }
}
