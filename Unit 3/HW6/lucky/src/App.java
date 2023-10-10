import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // prompt user for age.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // are they lucky?
        if (age == 13) { //FIXED AREA ADDED SECOND = TO FIX ERROR
        System.out.println("Lucky 13!");
}



    }
}
