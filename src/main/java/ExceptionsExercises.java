public class ExceptionsExercises {

    public static void main(String[] args) {

        int[]tab=new int[5];
        try {
            for (int i = 0; i <= tab.length+1; i++) {
                tab[i] = i;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You exceed the boundries of the declared table! Please check the table size!");
        }
    }
}
