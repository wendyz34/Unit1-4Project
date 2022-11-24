import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        //intro
        System.out.println("Hello, this is a budgeting application. You'll be asked a series of question when you're done type done. ");
        System.out.println("What is your monthly earning?");
        double totalBill = scan.nextDouble();
        System.out.println("How much are you planning to save? ");
        double savings = scan.nextDouble();
        Budget original = new Budget(totalBill, savings);
        System.out.println("Amount left for other spendings: " + original.amountLeft());
        original.Categories();
        original.otherSpendings();
        /*if (done==true){
            System.out.println("Application done");
        }*/


    }
}