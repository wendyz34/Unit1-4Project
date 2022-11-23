import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        System.out.println("Hello, this is a bugeting appplication");
        System.out.println("What is your monthly earning?");
        double totalBill = scan.nextDouble();
        System.out.println("How much are you planning to save? ");
        double savings = scan.nextDouble();
        Runner original = new Runner(totalIncome, savings);
    }
}