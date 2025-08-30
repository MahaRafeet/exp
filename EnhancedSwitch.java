import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the day :");
        String day =scanner.nextLine();
        switch(day){
            case "Sunday","Monday","Tuesday","Wednesday","Thursday" -> System.out.println("It's Weekday ");
            case "Friday","Saturday"-> System.out.println("It's WeekEnd");
            default -> System.out.println(day +  " is not a day");
        }

    }
}
