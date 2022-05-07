import java.util.Scanner;

public class TablesNextExercise {

    public static void main(String[] args) {

        int elements=0;
        int number=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tel me how many numbers You want to insert into the table?");
        elements = scanner.nextInt();
        int [] tab = new int[elements];
        System.out.println("What numbers You want to write into the table?");
        for(int i =0; i<elements; i++){
            number = scanner.nextInt();
            tab[i] = number;
        }
        int counter =0;
        while(counter !=tab.length){
            System.out.println(tab[counter]);
            counter++;
        }
    }
}
