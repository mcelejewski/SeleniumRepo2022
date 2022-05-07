import java.util.Scanner;

public class TablesExercise {

    public static void main(String[] args) {

        int tabLength;
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many items You want to insert into the table?");
        tabLength = scanner.nextInt();
        scanner.nextLine();

        String[] tab = new String[tabLength];
        System.out.println("Insert names into the table: ");
        for(int i = 0; i<tab.length; i++){
            System.out.println("");
            name = scanner.nextLine();
            tab[i] = name;
            System.out.println("Index: "+ i +" Imię: " + tab[i]);
        }
        for (int i = 0; i<tab.length; i++){
            //System.out.println("Index: "+ i +" Imię: " + tab[i]);
        }

//        String name = null;
//        String[] tab = new String[5];
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Insert names into the table: ");
//        for(int i = 0; i<tab.length; i++){
//            name = scanner.nextLine();
//            tab[i] = name;
//        }
//        for(int i = 0; i< tab.length; i++){
//            System.out.println("The element " + (i+1) + " is " + tab[i]);
//        }
    }
}
