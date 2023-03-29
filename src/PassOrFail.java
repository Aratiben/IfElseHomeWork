import java.util.Scanner;

public class PassOrFail {

    public static void main(String[] args) {
        PassOrFail passOrFail = new PassOrFail();
        passOrFail.Answer();
    }

    public void Answer() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please type eng marks");
        int eng = scanner.nextInt();          //storing eng marks
        System.out.println("please type maths marks");
        int maths = scanner.nextInt();       //storing maths marks
        System.out.println("please type sci marks");
        int sci = scanner.nextInt();        //storing sci marks

        if (eng >= 35 && maths >= 35 && sci >= 35)    //comparing marks with 35
        {
            System.out.println("you have passed"); //printing result
        } else {
            System.out.println("you have failed"); //printing result
        }
    }
}
