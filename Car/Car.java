package Car;

import java.util.Scanner;

public class Car {
   public Scanner scanner=new Scanner(System.in);
    public String name="Ford";
  public  int model =2025;
    public String color ="White";
    public boolean isRuning=false;


    public void runing(){
     isRuning=true;
        System.out.println("You start the engine");

    }


    public void stoping(){
          isRuning=false;
        System.out.println("You stop the engine");
    }

    public double hoursRuning(){
        System.out.print("Enter how many kilos the car drive : ");
        double kiloMeter=scanner.nextInt();
        System.out.print("Enter the Avarege speed : ");
       double speed=scanner.nextInt();

        double hoursUsed=(kiloMeter/speed);
        return hoursUsed;

    }

}
