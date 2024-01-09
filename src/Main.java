import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNum = new Random();

        //Variables
        int[] dataPoints = new int[100];
        String total = "";
        int sum = 0;
        int avg = 0;
        int max = 0;
        int min = 100;

        //First loop
        for (int i = 0; i <= dataPoints.length; i++) {
            int num = randomNum.nextInt(100);
            dataPoints[i] = num;
        }

        //Second loop
        for (int j = 0; j <= dataPoints.length; j++) {
            total = total+ " | " +dataPoints[j];

        }
        System.out.print("Data : " +total);

        //Third loop
        for(int k = 0; k <= dataPoints.length; k++){
                sum = sum + dataPoints[k];
                avg = sum/dataPoints.length;
            if(dataPoints[k] > max){
                max = dataPoints[k];
            }
            if(dataPoints[k] < min){
                min = dataPoints[k];
            }
        }
        System.out.println("Sum : " + sum);
        System.out.println("Avg : " + avg);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}