import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Random object to creat random number
        Random random = new Random();
        int guess = 0;
        int attempt=0;
        int randomNumber = random.nextInt(1, 11);
        System.out.println("Number Guessing Game");
        System.out.println("Guess a Number between 1 and 10 ");
        //do-while loop
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
