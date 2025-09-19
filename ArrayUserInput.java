import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUserInput {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of fruits do you want to add :");
            int fruitSize=scanner.nextInt();
        String [] fruits = new String[fruitSize];
        scanner.nextLine();

            for (int i=0 ;i<fruitSize ;i++){
                System.out.print("Enter the #  " + (i+1) + " fruit :");
                fruits[i]=scanner.nextLine();

        }
            for (String fruit : fruits){
                System.out.print(fruit+ " ");
            }

    }


}
