import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter the temperature t= ");
        Scanner scanner = new Scanner(System.in);
        int temperatureValue = scanner.nextInt();
        System.out.println("Please enter 1 for conversion Celsius - Fahrenheit or 2 for conversion Fahrenheit - Celsius: ");
        int temperature = scanner.nextInt();
        if (temperature == 1) System.out.println("The Fahrenheit temperature is: " + (temperatureValue * 9 / 5 + 32));
        else System.out.println("The Celsius temperature is: " + ((temperatureValue - 32)*5/9));

    }
}