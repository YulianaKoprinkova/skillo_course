//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbersArray = {10, 20, 30, 40, 50};

  //      for (int index = 0; index < numbersArray.length / 2; index++) {
  //          int endPosition = numbersArray.length - index - 1;
  //          int tempValue = numbersArray[index];
  //          numbersArray [index] = numbersArray[endPosition];
  //          numbersArray[endPosition] = tempValue;

  //      }

        for (int sPosition = 0, endPosition = numbersArray.length - 1;
             sPosition < numbersArray.length / 2; sPosition++, endPosition--) {
           int tempValue = numbersArray[sPosition];
            numbersArray [sPosition] = numbersArray[endPosition];
            numbersArray[endPosition] = tempValue;

       }

        // print result
        for (int value : numbersArray ) {
            System.out.print (value + " , ");
        }
    }
}