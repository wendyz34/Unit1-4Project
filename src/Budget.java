import java.util.Scanner;
import java.util.ArrayList;
/**Budget class initialize the private variables*/
public class Budget {

    private double totalBill;
    private double savings;
    private String categories;
    private String otherspending;
    private String month;

    /**
     * Budget class  initialize the variables and make an object with the totalBill and saving
     */
    public Budget(double totalBill, double savings) {
        this.totalBill = totalBill;
        this.savings = savings;
        this.categories = categories;
        this.otherspending = otherspending;
        this.month = month;
//

    }

    /**
     * toString() method ask for the month that the user is making the budget for
     */
    public String toString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What month are you making this budget for?");
        month = scan.nextLine();
        return month;
    }

    /**
     * amountLeft() method show the user the amount left they can plan for other spending through the month
     *
     * @ also shows if a budget is necessary to much is saved
     */
    public double amountLeft() {
        double left = (roundedToHundredth(totalBill - savings));
        Scanner scan = new Scanner(System.in);
        if (left == 0 || left < 0) {
            System.out.println("You saved everything or it's over your monthly way. Program ends.");
            System.exit(0);

        } else {
            return left;
        }
        return left;
    }

    /** roundedToHundredth method rounds money*/
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.000;

    }

    /** Categories does a lot of calculation
     * @ more explanation in the comments
     */
    public void Categories() {
        //ask how much other categories user what to split the money
        Scanner scan = new Scanner(System.in);
        System.out.println("Num of categories: ");
        int numCategories = scan.nextInt();
        //name the categories
        ArrayList<String> categories = new ArrayList<String>();
        for (int i = 1; i <= numCategories; i++) {
            String s = scan.nextLine();
            System.out.println("Name your categories(Press enter twice after you finish typing): ");
            categories.add(scan.nextLine());
        }
        //Checks for repeated names and tells the user
        for (int i = 0; i < numCategories; i++) {
            for (int j = i + 1; j < numCategories; j++) {
                if (categories.get(i).equals(categories.get(j))) {
                    System.out.println("Letting you know " + categories.get(i+1) + " is repeated");
                }
            }
        }

        //enter estimated amount for each category
        ArrayList<Double> spending = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < numCategories; i++) {
            System.out.println("Enter your approximate amount for category" + " " + num);
            spending.add(scan.nextDouble());
            num++;
        }
        //total for categories combined
        double total = 0;
        for (int i = 0; i < numCategories; i++) {
            total += spending.get(i);
        }
        total = roundedToHundredth(total);
        System.out.println("Amount for categories added together:  $" + total);
        for (int y = 0; y < numCategories; y++) {
            otherspending = categories.get(y) + ": " + spending.get(y);
        }
        //prints a summary for the month
        System.out.printf("--------------------------------%n");
        System.out.printf("         " + month + " Summary        %n");
        System.out.printf("--------------------------------%n");
        System.out.println("|Starting Total: " + "$" + totalBill + "       |");
        System.out.println("|Planned Savings: " + "$" + savings + "      |");
        for (int y = 0; y < numCategories; y++) {
            otherspending = "|" + categories.get(y) + ": " + "$" + spending.get(y) + "            |";
            System.out.println(otherspending);
        }
        if ((amountLeft() - total) < 0) {
            System.out.println("|Your planned spending is over by  " + Math.abs((amountLeft() - total)) + "|");
        } else {
            System.out.println("|Remaining:         " + "$" + (amountLeft() - total) + "|");
        }
        System.out.printf("--------------------------------%n");


    }
}
