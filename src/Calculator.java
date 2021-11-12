import java.util.Scanner;

public class Calculator {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int array[] = input_numbers();

        int result[] = doCalculate(array);

        System.out.println("Your result: ");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] input_numbers () {

        int size = 3;
        int array[] = new int[size];
        System.out.println("Insert numbers:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        return array;
    }

    public static int[] doCalculate(int[] array) {

        int size = 3;
        int array_result[] = new int[size];

        for (int i = 0; i < size; i++) {
            array_result[i] = array[i]/5;
        }

        return array_result;

    }

}