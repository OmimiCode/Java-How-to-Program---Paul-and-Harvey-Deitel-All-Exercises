
import java.util.Arrays;
import java.util.Scanner;
public class BarChart {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//            int[] numbers = new int[5];
//            String[] bars = new String[5];
//
//            for (int i = 0; i < bars.length; i++)
//                bars[i] = "";
//
//            for (int i = 0; i < numbers.length;) {
//                System.out.print("Enter a number between 1 and 30: ");
//                numbers[i] = input.nextInt();
//
//                if (numbers[i] < 1 || numbers[i] > 30)
//                    System.out.println(" - Error: number must is between 1-30. Try again!");
//                else {
//                    for (int j = 0; j < numbers[i]; j++)
//                        bars[i] += "*";
//
//                    i++;
//                }
//            }
//            input.close();
//
//            for (int i = 0; i < numbers.length; i++)
//                System.out.printf("%02d = %s%n", numbers[i], bars[i]);


        System.out.println("enter first input");
        int num1 = input.nextInt();

        System.out.println("enter second input");
        int num2 = input.nextInt();

        System.out.println("enter third input");
        int num3 = input.nextInt();

        System.out.println("enter fourth input");
        int num4 = input.nextInt();

        System.out.println("enter fifth input");
        int num5 = input.nextInt();
        int asterisks;
        if (num1 >= 1 && num1 <= 30 && num2 >= 1 && num2 <= 30 && num3 >= 1 && num3 <= 30 && num4 >= 1 && num4 <= 30 && num5 >= 1 && num5 <= 30) {

            System.out.printf("%3d ", num1);
            for (asterisks = 1; asterisks <= num1; asterisks++) {
                System.out.print("*");
            }

            System.out.println();

            System.out.printf("%3d ", num2);
            for (asterisks = 1; asterisks <= num2; asterisks++) {
                System.out.print("*");
            }
            System.out.println();

            System.out.printf("%3d ", num3);
            for (asterisks = 1; asterisks <= num3; asterisks++) {
                System.out.print("*");
            }

            System.out.println();

            System.out.printf("%3d ", num4);
            for (asterisks = 1; asterisks <= num4; asterisks++) {
                System.out.print("*");
            }

            System.out.println();

            System.out.printf("%3d ", num5);
            for (asterisks = 1; asterisks <= num5; asterisks++) {
                System.out.print("*");
            }

        } else {
            System.out.println("enter digits between 1 and 30");
        }


    }
}