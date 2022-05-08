package CodeAdvent1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SonarMeasurement {

    public static void main(String[] args) {

        List <Integer> list = new ArrayList();
        try{
            File file = new File("C:\\Users\\mcelejewski\\IdeaProjects\\CodeAdvent1\\input.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String depth = scanner.nextLine();
                int intDepth = Integer.parseInt(depth);
                list.add(intDepth);
            }
        }catch(FileNotFoundException e){
            System.out.println("No file at the directory!!!");
            e.printStackTrace();
        }
        System.out.println("Counter: " + countDepthIncrease(list));
    }

    public static int countDepthIncrease(List<Integer>list){
        int depthCounter =0;
        for(int i= 1; i<list.size(); i++){
            if(list.get(i) > list.get(i-1)){
                depthCounter++;
            }
        }
        return depthCounter;
    }
}
