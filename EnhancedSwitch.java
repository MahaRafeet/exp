import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the day :");
        String day =scanner.nextLine();
        switch(day){
            case "Sunday"-> System.out.println("It's Weekday");
            case "Monday"-> System.out.println("It's Weekday");
            case "Tuesday"-> System.out.println("It's Weekday");
            case "Wednesday"-> System.out.println("It's Weekday");
            case "Thursday"-> System.out.println("It's Weekday");
            case "Friday"-> System.out.println("It's WeekEnd");
            case "Saturday"-> System.out.println("It's WeekEnd");
            default -> System.out.println(day +  " is not a day");
        }

    }


}
