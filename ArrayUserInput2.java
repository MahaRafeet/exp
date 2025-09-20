import java.util.Scanner;

public class ArrayUserInput2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"Apple", "Orange", "Grape", "Pinapple"};
        System.out.println("Enter the fruit you want to search for  :");
        String target = scanner.nextLine();
        boolean isFound=false;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(target)) {
                System.out.print("The  " + target + "  was found in index  " +  i);
                isFound=true;
                break;
            }

        }
         if(!isFound){
            System.out.println("The " + target + " is not found ");
        }

        }


    }
