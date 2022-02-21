package ie.tudublin;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){
        final byte PERCENT = 100;       //final is constant
        final byte MONTHS_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principlevalue = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");       
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT /MONTHS_YEAR;
         
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();    
        int numberOfPayments = years * MONTHS_YEAR; //totalPayments is number of payments interest every month 

        // double mortgage = (principlevalue)*((actualInterest*Math.pow((1+actualInterest), months))/(Math.pow((1+actualInterest), months)) - 1);
        double mortgage = principlevalue 
                            * ((monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments ))
                            / (Math.pow(1+monthlyInterest, numberOfPayments) - 1 ));

        String mortgageFormatted  = NumberFormat.getCurrencyInstance(Locale.CANADA).format(mortgage);
        System.out.println(principlevalue);
        System.out.println(monthlyInterest);
        System.out.println(numberOfPayments);
        System.out.println(mortgageFormatted);  


    }
    
}
