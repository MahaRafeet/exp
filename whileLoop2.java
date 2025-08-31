import java.util.Scanner;
public class whileLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Age = 0;
        System.out.print("Enter your Age :");
        Age=scanner.nextInt();
        //while loop prevent the negative numbers of Age 
        while (Age<0) {
            System.out.println("Your Age can't be negative ");
            System.out.print("Enter your Age :");
            Age=scanner.nextInt();
        }

        System.out.println("Your Age is  "+Age +" Years old ");
    }
}


