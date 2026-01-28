import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double a = scan.nextDouble();
        double area = a * a, per = 4 * a, diag = a * Math.sqrt(2);
        System.out.println("\n---Results---");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + per);
        System.out.println("Diag: " + diag);
        scan.close();
    }
}
