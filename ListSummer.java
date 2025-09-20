import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSummer {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 9, 50, 16, 37);
        //Using for-each loop
        int sum = 0;
        for (int num : numbers) {

            sum += num;
        }
        System.out.println("The total sum using for loop is  : " + sum);

        System.out.println("The total sum using recursion is : "+ sumAll(numbers,0));

    }

        //using recursion
       public  static int sumAll(List<Integer>numbers , int index){
            if(index==numbers.size()){
                return 0;
            }
            return numbers.get(index)+sumAll(numbers,index+1);

        }

}
