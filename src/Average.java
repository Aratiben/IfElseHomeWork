import java.util.Scanner;

public class Average {                           //class name

    public static void Answer()                 // method name
    {
        Scanner scanner = new Scanner(System.in);     //using inbuilt class

        System.out.println("Type five numbers: ");     // printing message

        int A = scanner.nextInt(); //first int

        int B = scanner.nextInt();   //second int

        int C = scanner.nextInt(); //third int

        int D = scanner.nextInt(); //forth int

        int E = scanner.nextInt();  //fifth int

        double average = ((A + B + C + D + E) / 5.0);  //making total and divide by 5
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {      // main method
        Answer();
    }
}

