import java.util.Scanner;
import java.util.ArrayList;
public class Budget {

    private double totalBill;
    private double savings;

    private int numCategories;
    private String categories;

    public Budget(double totalBill, double savings) {
        this.totalBill = totalBill;
        this.savings = savings;
        this.categories = categories;
        //this.numCategories = numCategories;

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
    public void Categories(){
        categories = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Num of categories: ");
        int numCategories = scan.nextInt();
        ArrayList<String> names = new ArrayList<>();
        for(int i =0; i<=numCategories;i++) {
            //String nameC = scan.nextLine();
            System.out.println("Name your categtories: ");
            names.add(scan.nextLine());
            //categories+=nameC + "\n";
        }
       // System.out.println(names);
        //System.out.println(categories);
        ArrayList<Integer>spending= new ArrayList<>();
        for (int i =1; i<=numCategories;i++){
            System.out.println("Enter your appromiate amount for category" +" "+ i);
            spending.add(scan.nextInt());
        }
        double total = 0;
        for (int i =0;i<numCategories;i++){
            total += spending.get(i);
        }
        System.out.println(total);
        if ((amountLeft()-total)<0){
            System.out.println("Your other spendings is over by  " + Math.abs((amountLeft()-total)));
        }else{
            System.out.println("Remainding: " + (amountLeft()-total));
        }
    }

        public void end () {
            System.out.println("Monthly Summary: ");
            System.out.println(totalBill);
            System.out.println(savings);
            System.out.println("--------");
            System.out.println(categories);
            System.out.println("--------");
        }


        public double roundedToHundredth (double toRound){
            return Math.round(toRound * 100) / 100.000;

        }


    }
