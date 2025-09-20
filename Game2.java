import java.util.Random;
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Random random =new Random();
        String [] choice ={"Rock" ,"Paper","Scissor"};
        String playAgain;
        do {
            System.out.print("Enter your move (Rock , Paper,scissor ) : ");
            String userChoice = scanner.nextLine();
           String computerChoice=choice[random.nextInt(3)];
            System.out.println("Computer choice : " + computerChoice);
            
            if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("scissor")) ||
                    (userChoice.equalsIgnoreCase("Scissor") && computerChoice.equalsIgnoreCase("paper")) ||
                    (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock"))) {
                System.out.println("You Win!!");

            }
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It is a tie!!");
            } else {
                System.out.println("You lose!!");
            }
            System.out.println("Do you want to play again (yes/no) ?");
            playAgain = scanner.nextLine();
        }while(playAgain.equalsIgnoreCase("yes"));


    }
}
