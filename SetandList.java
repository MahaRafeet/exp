import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetandList {

    public static void main(String[] args) {
        List<Integer>numberList=new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(1);
        numberList.add(2);
        System.out.println("The numbers List is :" +numberList);
        //if we want to remove duplicate in a list we use Set
        Set<Integer>numberSet=new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println("The numbers Set is :" + numberSet);


    }
}
