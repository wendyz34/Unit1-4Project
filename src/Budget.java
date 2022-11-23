import java.util.Scanner;
public class Budget{

    private double totalBill;
    private double savings;
    private double categories;
    public Budget(double totalBill, double savings){
        this.totalBill= totalBill;
        this.savings = savings;
        this.categories = categories;

    }
    public double amountLeft(){
        double left = (totalBill-savings);
        Scanner scan = new Scanner(System.in);
        return left;
    }
    /*public double Categories(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How much categories of other spending do you want(put int): ");
        double otherspendings = scan.nextDouble();
        return Categories();
    }*/
    /*public double nameCategories(){
        for(int i =1; i==otherspendings;i++) {
            System.out.println("Name your categtories: ");
            categories = scan.nextInt();
        }
    }*/



    public double roundedToHundredth(double toRound){
        return Math.round(toRound*100)/100.000;

    }



}

