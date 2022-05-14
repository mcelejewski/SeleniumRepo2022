package CodeAdvent2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class LocationMultiplier {
    public static void main(String[] args) {

        int depth =0;
        int horizontalPosition =0;

        List<String> stringList = new ArrayList();

        try{
            File file = new File("C:\\Users\\mcelejewski\\IdeaProjects\\CodeAdvent1\\input2.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String newLine;
            while((newLine = br.readLine()) !=null){
                    stringList.add(newLine);
            }
            for (String item : stringList){
                String[] parts = item.split(" ");
                switch (parts[0]){
                    case "forward":
                        horizontalPosition += Integer.parseInt(parts[1]);
                        break;
                    case "up":
                        depth -= Integer.parseInt(parts[1]);
                        break;
                    case "down":
                        depth += Integer.parseInt(parts[1]);
                        break;

                }
                /*przy korzystaniu z if'a mimo spełnienia warunków, pętla zawsze wchodziła na ostatnii warunek
                * niezależnie od wartości part[0]*/
//                if(parts[0] == "forward"){
//                    horizontalPosition += Integer.parseInt(parts[1]);
//                }else if(parts[0] == "up"){
//                    depth += Integer.parseInt(parts[1]);
//                }else{
//                    depth -= Integer.parseInt(parts[1]);
//                }
                //System.out.println("Depth: " + depth);
                //System.out.println("Horizontal position: " + horizontalPosition);
            }
            int result = depth*horizontalPosition;
            System.out.println(result);
        }catch(FileNotFoundException e){
            System.out.println("No file at the directory!!!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
