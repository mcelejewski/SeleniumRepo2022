import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        System.out.println("Insert two numbers separated with spaces: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if(number1 < number2){
            System.out.println("number2 is greater than number1");
        }else if (number2 < number1){
            System.out.println("number1 is greater than number2");
        }else
            System.out.println("numbers are even");


    }
}
