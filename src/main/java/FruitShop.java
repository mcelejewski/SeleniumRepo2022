import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        String fruit;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of fruit you're interested in? ");
        fruit = scanner.nextLine();

            switch (fruit) {
                case "apples":
                case "bananas":
                case "oranges":
                    System.out.println("How many kilos are there?");
                    count = scanner.nextInt();
                    if (count < 100) {
                        System.out.println("You have " + ((count - 100) * (-1)) + " kilos left");
                    } else if (count > 100) {
                        System.out.println("Too many " + fruit + "You have to sell " + (count - 100) + " kilos");
                    }else
                        System.out.println("You have full storehouse and can't have more");
                    break;
                default:
                    System.out.println("You have no fruit of this kind");
                    break;
            }
        }

    }

