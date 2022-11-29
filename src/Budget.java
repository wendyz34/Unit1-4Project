import java.util.Scanner;
import java.util.ArrayList;
public class Budget {

    private double totalBill;
    private double savings;
    private String categories;
    private double spending;
    private String otherspending;
    private int numCategories;

    public Budget(double totalBill, double savings) {
        this.totalBill = totalBill;
        this.savings = savings;
        this.categories = categories;
        this.otherspending = otherspending;
        this.spending = spending;
        this.numCategories = numCategories;


    }

    public double amountLeft() {
        double left = (roundedToHundredth(totalBill - savings));
        Scanner scan = new Scanner(System.in);
        if (left < 0) {
            System.out.println("Over your monthly wage. Rerun to restart");
        } else if (left == 0) {
            System.out.println("Saving Everything");
        } else {
            return left;
        }
        return left;
    }
    public double roundedToHundredth (double toRound){
        return Math.round(toRound * 100) / 100.000;

    }

    /*public void Categories(){
        categories = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Num of categories: ");
        int numCategories = scan.nextInt();
        for(int i =0; i<=numCategories;i++) {
            String nameC = scan.nextLine();
            System.out.println("Name your categtories: ");
            categories+= nameC +"\n";
        }
        System.out.println(categories);
        categories.substring(0,categories.indexOf("\n"));
        double total = 0;
        for (int i =1; i<=numCategories;i++){
            System.out.println("Enter your appromiate amount for category" +" "+ i);
            total += scan.nextDouble();
        }
        if ((amountLeft()-total)<0){
            System.out.println("Your other spendings is over by  " + Math.abs((amountLeft()-total)));
        }else{
            System.out.println("Remainding: " + (amountLeft()-total));
        }
    }*/
    public void Categories() {
        //ask how much other categories user what to split the money
        Scanner scan = new Scanner(System.in);
        System.out.println("Num of categories: ");
        int numCategories = scan.nextInt();
        //name the categories
        ArrayList<String> categories = new ArrayList<String>();
        for (int i = 1; i <= numCategories; i++) {
            String s = scan.nextLine();
            System.out.println("Name your categories(Press return twice after you finish typing): ");
            categories.add(scan.nextLine());
        }
        System.out.println(categories);
        //enter estimated amount for each category
        ArrayList<Double> spending = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < numCategories; i++) {
            System.out.println("Enter your approximate amount for category" + " " + num);
            spending.add(scan.nextDouble());
            num++;
        }
        System.out.println(spending);
        //total for categories combined
        double total = 0;
        for (int i = 0; i < numCategories; i++) {
            total += spending.get(i);
        }
        System.out.println(total);
        if ((amountLeft() - total) < 0) {
            System.out.println("Your planned spending is over by  " + Math.abs((amountLeft() - total)));
            // System.exit(0);
        } else {
            System.out.println("Remaining: " + (amountLeft() - total));
        }
        /*for (int y =0; y<numCategories;y++){
            otherspending = categories.get(y)+ ": " + spending.get(y);
            System.out.println(otherspending);
        }*/

        System.out.printf("--------------------------------%n");
        System.out.printf("     Monthly Summary    %n");
        System.out.printf("--------------------------------%n");
        System.out.println("|Starting Total |" + totalBill + "|");
        System.out.println("|Savings |" + savings +"|");
        for (int y = 0; y < numCategories; y++) {
            otherspending = categories.get(y) + ": " + spending.get(y);
            System.out.println(otherspending);
        }
        System.out.printf("--------------------------------%n");


    }
}
