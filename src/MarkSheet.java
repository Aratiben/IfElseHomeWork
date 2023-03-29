import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        MarkSheet markSheet = new MarkSheet();
        markSheet.score();
    }

    public void score() {
        Scanner scanner = new Scanner(System.in);  // import scanner class
        System.out.println("Please write your name:" + "");
        String name = scanner.nextLine();    // storing name
        System.out.println("please write your roll number");
        int roll = scanner.nextInt();  // storing roll number
        System.out.println("please enter your eng marks");
        int eng = scanner.nextInt();  //storing eng marks
        System.out.println("please enter your maths marks");
        int maths = scanner.nextInt();    // storing maths marks
        System.out.println("please enter your sci marks");
        int sci = scanner.nextInt();    //storing sci marks
        int total = (eng + maths + sci);
        System.out.println(total);     // storing total
        double percentage = total / 3.0;
        System.out.println("your Percentage is =" + percentage);

        if (percentage >= 80) {
            System.out.println("You got grade A+");
        } //printing grade A+
        else if (percentage >= 60) {
            System.out.println("You got grade A");  // printing Grade A
        } else if (percentage >= 50) {
            System.out.println("You got grade B");  // printing Grade B
        } else if (percentage >= 35) {
            System.out.println("you got grade C"); // printing Grade C
        } else {
            System.out.println("you failed"); // Printing Fail
        }
    }
}
