import java.util.Scanner;

public class Delivery {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = input_number();
        int result = doFactorial(number);

        System.out.println("Your result: " + result);

    }

    public static int input_number () {

        System.out.println("Please, enter number: ");
        int number;
        if(input.hasNextInt()){
            number = input.nextInt();
        } else {
            System.out.println("Wrong input, please, enter your number again! ");
            input.next();
            number = input_number();

        }
        return number;
    }

    public static int doFactorial (int number) {
        int result;
        if (number == 0) {
            result = 1;
        } else {
            result = number * doFactorial(number - 1);
        }

        return result;

    }

}