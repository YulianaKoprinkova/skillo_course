//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbersArray = {10, 20, 30, 40, 50};
        int[] reversedArray = {0, 0, 0, 0, 0};

        for (int index = 0; index < numbersArray.length; index++) {
            int endPosition = numbersArray.length - index - 1;
            reversedArray [index] = numbersArray[endPosition];
        }
        for (int value : reversedArray ) {
            System.out.print (value + " , ");
        }



    }
}