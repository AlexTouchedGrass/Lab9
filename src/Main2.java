import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNum = new Random();

        //Input Helper
        int userInt = InputHelper.getRangedInt(scan,"Please enter an integer between 1 and 100.",1,100);

        //Variables
        String total = "";
        int[] dataPoints = new int[100];
        boolean done = false;
        int index = 0;

        //First loop
        for (int i = 0; i < dataPoints.length; i++) {
            int num = randomNum.nextInt(100);
            dataPoints[i] = num;

            if (num == userInt) {
                index++;
            }
        }

        System.out.println("The number " +userInt+ " was found " +index+ " times.");

        //Input Helper
        int userInt2 = InputHelper.getRangedInt(scan,"Please enter another integer between 1 and 100.",1,100);

        //Second loop
        for (int j = 0; j < dataPoints.length; j++) {
            if (dataPoints[j] == userInt2) {
                done = true;
                System.out.println("The first occurence of " +userInt2+ " was " + j);
                break;
            }
        }

        if (!done) {
            System.out.println("The integer was not found.");
        }



    }

}
