package ie.tudublin;

import java.util.Random;

public class RandomCreation {
    public static void main(String[] args){
        Random random = new Random();
        
        int x = random.nextInt();   //from -2B to 2B
        int dice = random.nextInt(6)+1; //1 through 6 if 6 removed 0 through 5
        System.out.println(x);  
        System.out.println(dice);
    }
}
