import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("How many products do you want to purchase?");
        Scanner scanner = new Scanner(System.in);
        int productNumber = scanner.nextInt();
        double price = 0.05;
        double totalPrice = productNumber * price;


        if (productNumber < 100) {
            System.out.println("The total price is " + totalPrice);
        }
        else if (productNumber > 120) {
            System.out.println("You have a 20% discount. The total price is: " + totalPrice * 0.8);
        }

        else {
            System.out.println("You have a 15% discount. The total price is: " + totalPrice * 0.85);
        }

        }
    }
