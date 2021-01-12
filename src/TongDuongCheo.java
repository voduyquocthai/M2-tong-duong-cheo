import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[][];
        System.out.println("Enter rows and columns:");
        int rows = input.nextInt();
        array = new int[rows][rows];
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                System.out.println("Enter");
                array[row][column] = input.nextInt();
            }

        }
        for (int i = 0; i < array.length; i++)
            System.out.println(Arrays.toString(array[i]));
        int sum = 0;
        for (int i = 0; i < array.length;i++){
            sum += array[i][i];
        }
        System.out.println("Tổng của các phần tử trong đường chéo là: " + sum);
    }
}
