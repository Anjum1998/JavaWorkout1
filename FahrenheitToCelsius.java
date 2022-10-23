import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input temperature in fahrenheit");
        float Fahrenheit= sc.nextFloat();
        float outputCelsius=((Fahrenheit-32)*5)/9;
        System.out.println("The corresponding temperature in Celsius is "+ outputCelsius);
    }
}
