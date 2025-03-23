import java.util.Scanner;

public class Triangle_Check {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a+b+c!=180 || a == 0 || b == 0 || c == 0) {
            System.out.println("A triangle does not exist!");
        }
        else {
            System.out.println(" success ");
            if  (a <= 90 && b <= 90 && c <= 90) {
                System.out.println("the triangle is acute");
                if (a == 60 && b == 60 && c == 60) {
                    System.out.println("the triangle is equilateral");
                }
                else if ( a == 90 || b == 90 || c == 90) {
                    System.out.println("the triangle is right-angled");
                }
                else if (a == b || b == c || a == c) {
                    System.out.println("the triangle is isosceles");
                }
                else {
                    System.out.println("the triangle is multifaceted");
                }

            }
            else if (a == b || b == c || a == c) {
                System.out.println("the triangle is obtuse " + "the triangle is equilateral");
            }
            else System.out.println("the triangle is obtuse " + "the triangle is multifaceted" );
        }




    }
}
