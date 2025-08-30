import java.util.Scanner;

public class LogicOperators {
    public static void main(String[] args) {
        //username must be 4-25 character
        //username should not contain spaces or underscore
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the user name :");
        String userName=scanner.nextLine();
        //check the length of the user name
        if(userName.length()<4 || userName.length()>25) {
            System.out.println("The userName length must be more than 4 and less than 25 char ");
        }
        //check the spaces and underscore 
            if (userName.contains("_") || userName.contains(" ")){
                System.out.println("User name should not contains underscore or spaces ");
            }
            else{
                System.out.println("Welcome "+ userName);
            }
            scanner.close();
        }
    }

