import java.util.Scanner;

public class SayHi {
    public static void main(String[] args) {
        String name;

        System.out.println("What's Your name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        switch (name){
            case "Marek":
                System.out.println("Hello Marek nice to meet You :)");
                break;
            case "Tomek":
                System.out.println("Hi there Tomek:)");
                break;
            case "Kasia":
                System.out.println("Hello Kasia:)");
                break;
            default:
                System.out.println("Who are You? I've never seen You before");
                break;
        }
    }
}
