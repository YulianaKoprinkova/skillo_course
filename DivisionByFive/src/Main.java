//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbersArray = {0, -15, 12, 15, 32, 42, 55, 75, 122, 132, 150, 150, 180, 200};
        int index = 1;

        for (int number : numbersArray) {
            if (number > 150) {
                System.out.println("You have reached а number greater than 150 at position " + index);
                System.out.println("The element is equal to " + number);
                break;
            }

            else if (number % 5 == 0) {
                System.out.println("The element at position " + index + " is divisible by 5 and it's value is " + number);
                }

            else {
                System.out.println("The element at position " + index + " is not divisible by 5");
                 }

        index++;

        }

        System.out.println("The end");

    }

}