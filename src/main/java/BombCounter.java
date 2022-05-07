import java.util.Scanner;

public class BombCounter {
    public static void main(String[] args) throws InterruptedException {
        int number;
        int counter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many seconds i have to run?");
        number = scanner.nextInt();
        counter = number;
        System.out.println("---FOR LOOP---");
        for(int i =number; i!=0; i--){
            System.out.println("The bomb will explode in: " + i +" !");
            Thread.sleep(1000);
        }
        System.out.println("BOOOOM !!!!!");

        System.out.println("---WHILE LOOP---");
        while( counter != 0){
            System.out.println("The bomb will explode in: " + counter + "!");
            Thread.sleep(1000);
            counter --;
        }
        System.out.println("BOOOOM !!!!!");

        System.out.println("---DO WHILE LOOP---");
        counter = number;
        do {
            System.out.println("The bomb will explode in: " + counter + "!");
            Thread.sleep(1000);
            counter --;
        }while(counter !=0);
        System.out.println("BOOOOM !!!!!");
    }
}
