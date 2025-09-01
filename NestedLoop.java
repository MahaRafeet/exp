import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        System.out.print("Enter Symbol to use: ");
        char symbol = scanner.next().charAt(0);
        //nested loop -> loop inside loop 
        for(int i= 0 ; i<row;i++){
            for(int j =0 ; j<columns ;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }



    }
}
