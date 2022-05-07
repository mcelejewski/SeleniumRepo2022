import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        boolean conRun = true;
        while(conRun) {
            isPrime(readGivenNumber());
        }
    }

    public static int readGivenNumber(){
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER 0 OR 1 IF YOU WANT TO EXIT PROGRAM");
        System.out.println("Enter only one number to check if its prime: ");
            try {
                number = scanner.nextInt();

                if (number == 0 || number == 1) {
                    System.exit(0);
                } else if (number < 0) {
                    System.out.println("Wrong input! You can enter only positive numbers \n");
                }
//                if(scanner.hasNextInt())
//                {
//                    System.out.println("Enter one value! Only first value will be checked!");
//                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input! You can enter only positive numbers! \n");
            }
        return number;
    }

    public static void isPrime(int num){
        double border = Math.round(Math.sqrt(num));
        boolean ifNotPrimeFlag = false;                      //Flaga ustawiana, aby przy liczbie niepierwszej, nie
        for(int i =2; i<=border; i++){                       //był wyświetlany komunikat o tym że liczba jest pierwsza
            if(num%i ==0){
                System.out.println("The number You entered is not a prime number. It can be divide by: " + i + "\n\n");
                ifNotPrimeFlag = true;
                break;
            }
        }if(ifNotPrimeFlag == false && num >0) {
            System.out.println("The number You entered is a prime number\n\n");
        }
    }

}
