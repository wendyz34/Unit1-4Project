import java.util.Scanner;
public class Budget{

    private double totalBill;
    private double savings;

    private int numCategories;
    private String categories;
    public Budget(double totalBill, double savings){
        this.totalBill= totalBill;
        this.savings = savings;
        this.categories = categories;
        this.numCategories = numCategories;

    }
    public double amountLeft(){
        double left = (roundedToHundredth(totalBill-savings));
        Scanner scan = new Scanner(System.in);
        if (left<0){
            System.out.println("Over your monthly wage. Rerun to restart");
        }else if(left==0){
            System.out.println("Saving Everything");
        }else{
            return left;
        }
        return left;
    }
    public String Categories(){
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
        return categories;

    }
    public void otherSpendings(){
        Scanner scan = new Scanner(System.in);
        double total = 0;
        for (int x =1;x<=numCategories;x++){
            System.out.println("Enter your appromiate amount for category" + " " +  x);
             total += scan.nextDouble();
        }
        System.out.println(total);
    }
    public void end(){
        System.out.println("Remainding: ");
    }





    public double roundedToHundredth(double toRound){
        return Math.round(toRound*100)/100.000;

    }



}