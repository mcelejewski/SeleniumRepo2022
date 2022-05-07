import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        boolean conRun = false;
        while(!conRun) {
            isPrime(readGivenNumber());
        }
    }

    public static int readGivenNumber(){
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if its prime: ");
        number = scanner.nextInt();
//        try{
//            number = scanner.nextInt();
//        }catch(Exception e){
//
//        }
//        finally{
            return number;
//        }
    }

    public static void isPrime(int num){
        double border = Math.round(Math.sqrt(num));
        for(int i =2; i<=border; i++){
            if(num%i ==0){
                System.out.println("The number You entered is not a prime number. It can be divide by: " + i);
                break;
            }
        }
        System.out.println("The number You entered is a prime number");
    }

}
