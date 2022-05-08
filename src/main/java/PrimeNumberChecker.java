import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        boolean conRun = true;
        while(conRun) {

            if(isPrime(readGivenNumber()) == true){
                System.out.println("The number You entered is not a prime number.\n\n");
            }else{
                System.out.println("The number You entered is a prime number\n\n");
            }
        }
    }

    public static int readGivenNumber(){
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER 0 OR 1 IF YOU WANT TO EXIT PROGRAM");
        System.out.println("Enter only one number to check if its prime: ");
            try {
                do {
                    number = scanner.nextInt();
                    if (number == 0 || number == 1) {
                        System.exit(0);
                    } else if (number < 0) {
                        System.out.println("Wrong input! You can enter only positive numbers!");
                        System.out.println("Choose another number: ");
                    }
                }while(number<0);
            } catch (InputMismatchException e) {
                System.out.println("Wrong input! You can enter only positive numbers! \n");
            }
        return number;
    }

    public static boolean isPrime(int num){
        double border = Math.round(Math.sqrt(num));
        boolean ifNotPrimeFlag = false;
        for(int i =2; i<=border; i++){
            if(num%i ==0){
                ifNotPrimeFlag = true;
                break;
            }
        }
        return ifNotPrimeFlag;
    }
}
