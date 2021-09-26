import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public  class Main {

    public static void main(String[] args) throws InterruptedException {

        String prevNums = "0";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int userNumber = input.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            prevNums = (prevNums + (i));
            System.out.println(prevNums);
            TimeUnit.MILLISECONDS.sleep(100);
        }

        for (int j = userNumber; j >= 1; j--) {
            for (int k = 0 ; k < j; k++) {
                System.out.print(k);

            }
            System.out.println("");
            TimeUnit.MILLISECONDS.sleep(100);
        }

    }
}