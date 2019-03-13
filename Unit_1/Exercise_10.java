package Unit_1;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;

        System.out.println("Enter temperature in Fahrenheit:");
        Scanner s = new Scanner(System.in);
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32)*5/9;
        System.out.println("Temperature in Celsius:" + celsius);        
    }
}
