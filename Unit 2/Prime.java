import java.util.Scanner;

public class Prime {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
    
        int number = 0;

        System.out.print("Enter the Number to check (No negatives or 0):");
        number = in.nextInt();

        if(isPrime(number)) {
            
            System.out.println("The number is Prime!");
        }
        else {

            System.out.println("The Number is not Prime :( ");
             }
    }
        static boolean isPrime(int number)
        {
        if(number<=1) {
            return false;
        }
        for(int i=2;i<=number/2;i++){
            if((number%i)==0)
                return false;
        }
        return true;
    }
}    



