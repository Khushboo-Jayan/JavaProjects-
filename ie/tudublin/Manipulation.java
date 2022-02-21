package ie.tudublin;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Manipulation {
    public static void main(String[] args) {
        float number = 10 / (float) 3;
        System.out.println(number);

        NumberFormat money = NumberFormat.getCurrencyInstance();
        String result = money.format(50000.69723);
        System.out.println(result);

        double amount = 200.0;
        Locale locale = new Locale("en", "USD");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(amount));

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String percentageResult = percentage.format(0.1);
        System.out.println(percentageResult);

        System.out.println(NumberFormat.getPercentInstance().format(0.69));

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            byte age = scanner.nextByte();
            System.out.println("You are "+age);   

            System.out.print("Enter Name: ");
            String name = (scanner.nextLine()).trim();
            System.out.println("You are "+name);
        }

    }
}
