import java.util.Scanner;

public class Bank {

    static Scanner input = new Scanner(System.in);

    public static final int MONTHLY_PAYMENT = 100;
    public static final int CREDIT = 5000;


    public static void main(String[] args) {
        System.out.println("Please, enter amount of payment: ");
        int number = inputNumber();

        boolean result = isArrears(number);

        int balance = CREDIT - number;
        int payments_balance = doPayments(number) - 1;
        int ideal_payment_term = ((CREDIT - number) / number);


        if (result) {
            System.out.println("Your payments OK!");
        } else {
            System.out.printf("You need to pay the %d amount of money after %d minimum payments or after %d months of your current payments %d !" ,balance, payments_balance, ideal_payment_term, number);
        }


    }



    public static int inputNumber () {

        int number;
        if(input.hasNextInt()){
            number = input.nextInt();
        } else {
            System.out.println("Wrong input, please, enter your number again! ");
            input.next();
            number = inputNumber();

        }
        return number;
    }

    public static int doPayments (int number) {
        int payments = (CREDIT - number) / MONTHLY_PAYMENT;
        return payments;
    }



    public static boolean isArrears (int number) {

        int payments = doPayments(number);

        if (payments <= 0) {
            return true;
        }

        return false;
    }







}