package ie.tudublin;

import java.text.NumberFormat;
import java.util.*;

public class MortgageErrorHandling {
    public static void main(String[] args){
        final byte PERCENT = 100;       //final is constant
        final byte MONTHS_YEAR = 12;

        try (Scanner scanner = new Scanner(System.in)) {
            int principlevalue = 0;
            float annualInterest = 0.0f, monthlyInterest = 0.0f;
            int numberOfPayments = 0;
            byte years = 0;

            //Enter principle value
            while(principlevalue < 1000 || principlevalue > 1_000_000) {
                System.out.print("Principle($1K - $1M): ");
                principlevalue = scanner.nextInt();
                if(principlevalue < 1000 || principlevalue > 1_000_000)
                    System.out.println("Enter a number between 1,000 and 1,000,000.");
            }

            //Enter Anuual Interest 
            while(annualInterest <= 0 || annualInterest > 30) {
                System.out.print("Annual Interest Rate: ");       
                annualInterest = scanner.nextFloat();
                if(annualInterest <= 0 || annualInterest > 30)
                    System.out.println("Enter a value greater than 0 and less than or equal to 30.");
                else
                    monthlyInterest = annualInterest / PERCENT /MONTHS_YEAR;
            }

            //Enter the number of years
            while(years <= 0 || years > 30) {
                System.out.print("Period (Years): ");
                years = scanner.nextByte();    
                if(years <= 0 || years > 30)
                    System.out.println("Enter a value greater than 0 and less than or equal to 30.");
                else
                numberOfPayments = years * MONTHS_YEAR; //totalPayments is number of payments interest every month
            }

            //calculate the mortgage
            double mortgage = principlevalue 
                                * ((monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments ))
                                / (Math.pow(1+monthlyInterest, numberOfPayments) - 1 ));
            
            //format the calculated mortgage
            String mortgageFormatted  = NumberFormat.getCurrencyInstance(Locale.CANADA).format(mortgage);
            
            //print the formatted mortgage
            System.out.println(mortgageFormatted);

            
            

        }  

    }
}
