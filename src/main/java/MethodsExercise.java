import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {

        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number to make calculations: ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        System.out.println(addNumbers(number1, number2));
        System.out.println(subtractNumbers(number1, number2));
        System.out.println(multiplyNumbers(number1, number2));
        System.out.println(divideNumbers(number1, number2));

    }
    public static int addNumbers(int a, int b){
        int result = a +b;
    return result;
    }
    public static int subtractNumbers(int a, int b) {
        int result = a - b;
        return result;
    }
    public static int multiplyNumbers(int a, int b) {
        int result = a * b;
        return result;
    }
    public static int divideNumbers(int a, int b) {
        int result =0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0");
        }
        return result;
    }

}
