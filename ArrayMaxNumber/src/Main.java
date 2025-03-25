//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbersArray = {3, 5, -12, 0, 24};
        int maxNumber = numbersArray[0];

        for (int number : numbersArray) {
            if (maxNumber < number){
                maxNumber = number;
            }
        }
        System.out.println("the maximum number in this string is: " + maxNumber);
    }
}