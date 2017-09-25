import java.text.NumberFormat;
import java.util.Scanner;

public class tipCalculator {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        //format commas and decimal points
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);


        //Initialize total
        double total = 0;

        //Call for total bill
        System.out.println("Enter total bill: ");
        total = scanner.nextDouble();

        //Secondary variables
        double tax = .025;
        double tip = .175;
        double totalWithTax = total + (total * tax);
        double totalTax = total * tax;
        double totalTip = totalWithTax * tip;
        String totalIn;
        String taxTotal;
        String totalOut;
        String totalTipOut;

        totalIn = nf.format(total);
        taxTotal = nf.format(totalTax);
        totalOut = nf.format(totalWithTax);
        totalTipOut = nf.format(totalTip);

        //print out
        System.out.println("Your bill is: " + totalIn + " . Your tax is: " + taxTotal
                + " . With tax your bill is: " + totalOut + " . Your recommended tip should be: " + totalTipOut + " ." );


    }



}
