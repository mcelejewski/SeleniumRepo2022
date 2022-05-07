import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachLoopExercise {
    
    public static void main(String[] args) {

        int counter =100;
        List<Integer>numberList=new ArrayList<>();
        for(int i=0; i<counter; i++){
            numberList.add(i);
        }
        for(int number : numberList) {
            if (number % 2 == 0) {
                numberList.set(number, number * 2);
            }
        }
        for (int number : numberList) {
            System.out.println(number);
        }

        
    }
}
