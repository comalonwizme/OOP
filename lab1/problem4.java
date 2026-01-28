import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Enter val of a: ");
        double a = scan.nextDouble();

        System.out.print("\nEnter val of b: ");
        double b = scan.nextDouble();
        System.out.print("\nEnter val of c: ");
        double c = scan.nextDouble();

        double d = b * b - 4 * a * c;
        if(d < 0){
            System.out.print("\nError(negative)");
            return;
        }
        double x1 = (-b - Math.sqrt(d)) / (2 * a), x2 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println("Root 1: " + x1);
        System.out.println("Root 2: " + x2);
        scan.close();
    }
}
