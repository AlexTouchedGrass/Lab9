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
        int filteredIndex = 0;
        int[] dataPoints = new int[100];
        int[] filteredDataPoints = new int[filteredIndex];

        //First loop
        for (int i = 0; i < dataPoints.length; i++) {
            int num = randomNum.nextInt(100);
            dataPoints[i] = num;

            if (num == userInt) {
                filteredDataPoints[filteredIndex] = dataPoints[i];
                filteredIndex++;
                System.out.println(dataPoints[i]);
            }
        }


        //Input Helper
        int userInt2 = InputHelper.getRangedInt(scan,"Please enter another integer between 1 and 100.",1,100);

        //Second loop
        for (int j = 0; j < dataPoints.length; j++) {
            if (dataPoints[j] == userInt2) {
                filteredDataPoints[filteredIndex] = dataPoints[j];
                break;
            }

        }


    }

}
