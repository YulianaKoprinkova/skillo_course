import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        float sideA, sideB, sideC, perimeter, area;
        Scanner scan = new Scanner(System.in);
        sideA = Float.parseFloat(scan.nextLine());
        sideB = Float.parseFloat(scan.nextLine());
        sideC = Float.parseFloat(scan.nextLine());
        perimeter = sideA + sideB + sideC;
        area = (float) (0.25 * Math.sqrt ((sideA + sideB + sideC) * (sideA + sideB - sideC) * (sideB + sideC - sideA) * (sideA + sideC - sideB)));
        System.out.println("The perimeter of a triangle with sides A, B and C is: " + perimeter);
        System.out.println("The area of the triangle is: " + area);
        scan.close();

        

    }
}
