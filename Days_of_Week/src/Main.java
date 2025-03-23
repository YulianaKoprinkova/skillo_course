import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter a number between 1 and 7");
        int dayOfWeekNumber = scanner.nextInt();

        switch(dayOfWeekNumber) {
            case 1:
                System.out.println("It is Monday!!");
                // code block
                break;
            case 2:
                System.out.println("It is Tuesday!!");// code block
                break;
            case 3:
                System.out.println("It is Wednesday!");
                break;
            case 4:
                System.out.println("It is Thursday!");
                break;
            case 5:
                System.out.println("It is Friday!");
                break;
            case 6:
                System.out.println("It is Saturday!");
                break;
            case 7:
                System.out.println("It is Sunday!");
                break;
            default:
                System.out.println("Enter a valid number!!!");
                break;
                // code block
        }



        };





    }

