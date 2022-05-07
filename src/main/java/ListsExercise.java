import java.util.ArrayList;
import java.util.List;

// better use "for" loop

public class ListsExercise {
    public static void main(String[] args) {
        int counter=0;
        int number;
        List<Integer> numberList = new ArrayList();
        while (counter !=101){
            if(counter%2 ==0){
                number = counter*2;
                numberList.add(number);
            }else
                numberList.add(counter);
            System.out.println(numberList.get(counter));
            counter++;

        }


    }
}
