import java.util.Scanner;
public class DoWhileLoop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter number :");
        num=scanner.nextInt();
        do {
            System.out.println("Please Enter number between 1 and 10 ");
            System.out.print("Enter number :");
            num=scanner.nextInt();
        }while (num<0 ||num>10);

        System.out.println("The number you picked is  "+num );
    }
}