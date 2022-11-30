import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //intro
        System.out.println("Hello, this is a budgeting application. You'll be asked a series of question to make your plan. ");
        System.out.println("What is your monthly earning?");
        double totalBill = scan.nextDouble();
        System.out.println("How much are you planning to save? ");
        double savings = scan.nextDouble();
        Budget startOff = new Budget(totalBill, savings);
        System.out.println("Amount left for other spendings: " + startOff.amountLeft());
        startOff.toString();
        startOff.Categories();


    }
}