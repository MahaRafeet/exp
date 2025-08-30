import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        double firstNum = scanner.nextDouble();
        System.out.print("Enter the operator (*,/,+,- ): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter the Second number: ");
        double secondNum = scanner.nextDouble();
        switch (operator) {
            case ('*') -> System.out.println(firstNum + " "+operator + " "+secondNum + "=" + (firstNum * secondNum));
            case ('/') -> {
                if(secondNum==0){
                    System.out.println("Can not divide by zero ");
                } else{
                    System.out.println(firstNum +" "+ operator +" "+ secondNum + "=" + (firstNum / secondNum));
                }
            }
            case ('+') -> System.out.println(firstNum +" "+ operator +" "+ secondNum + "=" + (firstNum + secondNum));
            case ('-') -> System.out.println(firstNum + " "+operator +" "+ secondNum + "=" + (firstNum - secondNum));
            default -> System.out.println("Invalid operator ");
        }
    }
}
