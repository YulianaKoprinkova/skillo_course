//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Create a List of Tasks

        List<String> taskList = new ArrayList<>();


// Add elements to the List
        taskList.add("Task 1");
        taskList.add("Task 2");
        taskList.add("Task 3");
        taskList.add("Task 4");

// Display the List
        System.out.println("List elements: " + taskList);

        List<Integer> boolTaskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int index = 1; index <= taskList.size(); index++) {

            System.out.print("Enter 0 for task incomplete or 1 for task completed: ");
            boolTaskList.add(scanner.nextInt());

        }



    }
}
