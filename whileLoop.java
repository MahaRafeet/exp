import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";
//while the response is not Q continue the loop 
        while (!response.equals("Q")) {
            System.out.print("you are playing game , Enter Q to quite :");
            response = scanner.next().toUpperCase();
        }
        System.out.println("YOU Quite the game ");
    }
}
