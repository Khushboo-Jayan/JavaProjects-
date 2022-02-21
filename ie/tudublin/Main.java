package ie.tudublin;

import java.awt.*;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World!!"); 
        
        //variables 
        //You can use a comma-separated list to declare more than one variable of the specified type. Example: int a = 42, b = 11;
        byte age = 20;
        int youtubeCount = 2_134_567_089; //_seperates every third digit like ,
        long twitterLikes = 9_000_000_000L; //if more than 2 billion
        float pi = 3.1415f;
        Date now = new Date();
        Point point1 = new Point(1,1);      //new Point(x: 1, y: 1) is illegal java. Legal java is new Point(1, 1).
        Point point2 = point1;

        System.out.println("\nBefore changing the values: ");
        Point location = point2.getLocation();
        String locationString = "[" + location.x + "," + location.y + "]";
        System.out.println(locationString);

        //change value of x 
        point1.x = 5;

        /*When you write something like someObject.getLocation() to the string, you're adding a Point object. 
        This means it is converted to string with toString() method exactly for java.awt.Point, which looks like: */

        System.out.println("\nAfter changing the values: ");
        Point locationChange = point2.getLocation();
        String locationChangeString = "[" + locationChange.x + "," + locationChange.y + "]";
        System.out.println(locationChangeString);
        System.out.println("\n"+now);

        boolean votingEligible = true;
        System.out.println(age);
        System.out.println(youtubeCount);
        System.out.println(twitterLikes);
        System.out.println(pi);
        System.out.println(votingEligible);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));   //if you print numbers it returns the  memory of object numbers
        
        //other way\
        int otherNumbers[] = {5,6,7,8};
        System.out.println(Arrays.toString(otherNumbers));
        System.out.println(otherNumbers.length);

        //two dimensional array
        int m =2, n=3;
        int[][] array1 = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j =0; j<n; j++){
                array1[i][j] = j*j;
            }
        }

        System.out.println(Arrays.deepToString(array1));

        //2d using curly braces 
        int[][] arrayCurly= { {1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(arrayCurly));

        //constants
        final float PI = 3.14f;
        System.out.println(PI);
    }
}
