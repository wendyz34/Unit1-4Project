import java.util.Scanner;
import java.util.ArrayList;
public class Budget {

    private double totalBill;
    private double savings;
    private String categories;
    private double spending;
    private String otherspending;
    private int numCategories;
//intilaize
    public Budget(double totalBill, double savings) {
        this.totalBill = totalBill;
        this.savings = savings;
        this.categories = categories;
        this.otherspending = otherspending;
        this.spending = spending;
        this.numCategories = numCategories;
//

    }
    //remaining amount after savings
    public double amountLeft() {
        double left = (roundedToHundredth(totalBill - savings));
        Scanner scan = new Scanner(System.in);
        if (left==0||left<0){
            System.out.println("You saved everything or it's over your monthly way. Program ends.");
            System.exit(0);

        }else{
            return left;
        }
        return left;
    }
    //rounds numbers
    public double roundedToHundredth (double toRound){
        return Math.round(toRound * 100) / 100.000;

    }

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
        //ERROR CHECK FOR REPEATED NAMES
       /*for (int i = 0; i<numCategories;i++){
           if(categories.get(i).equals(categories.get(i))){
               System.out.println("Letting you know " + categories.get(i+1) + "is repeated");
           }else{
               System.out.println(categories);
           }
       }*/
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
        for (int y =0; y<numCategories;y++){
            otherspending = categories.get(y)+ ": " + spending.get(y);
        }
        //prints a summary
        //PRINT THE ENDING IN THE SAME LENGTH
        System.out.printf("--------------------------------%n");
        System.out.printf("         Monthly Summary        %n");
        System.out.printf("--------------------------------%n");
        System.out.println("|Starting Total: " + "$" + totalBill + "       |");
        System.out.println("|Planned Savings: " + "$" + savings +"      |");
        for (int y = 0; y < numCategories; y++) {
            otherspending = "|" + categories.get(y) + ": " + "$" + spending.get(y) + "            |";
            System.out.println(otherspending);
        }
        if ((amountLeft() - total) < 0) {
            System.out.println("|Your planned spending is over by  " + Math.abs((amountLeft() - total))+"|");
        } else {
            System.out.println("|Remaining:         " + (amountLeft() - total) + "|");
        }
        System.out.printf("--------------------------------%n");


    }
}