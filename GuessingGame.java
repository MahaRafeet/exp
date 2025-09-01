import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess = 0;
        int attempt=0;
        int min =0;
        int max=100;

        int randomNumber = random.nextInt(min, max+1);
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a Number between %d and %d\n" ,min,max );
        do{
            System.out.print("Enter a guess : ");
            guess =scanner.nextInt();
            attempt++;
            if(guess<randomNumber){
                System.out.println("You are too low");
            }
            else if(guess>randomNumber){
                System.out.println("you are high ");
            }
            else {

                System.out.println("You Win ! after " +attempt +"  Times of trying");
                System.out.println(" The correct number is  "+ randomNumber);;

            }



        }while(guess !=randomNumber);
        scanner.close();
    }
}
