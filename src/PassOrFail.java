import java.util.Scanner;

public class PassOrFail {

    public static void main(String[] args) {
        PassOrFail passOrFail = new PassOrFail();
        passOrFail.Answer();
    }

    public void Answer() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type English marks: ");
        int eng = scanner.nextInt();          //storing eng marks
        System.out.print("Please type Maths marks: ");
        int maths = scanner.nextInt();       //storing maths marks
        System.out.print("Please type Science marks: ");
        int sci = scanner.nextInt();        //storing sci marks

        if (eng >= 35 && maths >= 35 && sci >= 35)    //comparing marks with 35
        {
            System.out.println("You have Passed"); //printing result
        } else {
            System.out.println("You have Failed"); //printing result
        }
    }
}
