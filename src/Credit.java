import java.util.Scanner;

public class Credit {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int salary = input_number();
        int balance = input_number();
        int premium = input_number();
        int credit = input_number();
        int term = input_number();

        if (isCredit(salary, balance, premium, credit, term)) {
            System.out.println("All OK! ");
        } else {
            System.out.println("All not OK!");
        }

        System.out.println("New test brunch!");
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

    public static boolean isCredit (int salary, int balance, int premium, int credit, int term) {
        balance = balance + premium;
        //int ideal_term = 1 + (credit / balance);
        int ideal_credit = term*balance;
        //int reduce_credit = credit - ideal_credit;

        boolean result = false;

        if ( balance * term >= credit) {
            result = true;
        } else {
            return result;
        }

        return  result;
    }



}