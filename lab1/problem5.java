import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the initial balance: ");
        double money = scan.nextDouble();
        System.out.print("\nEnter the interest(in %): ");
        double interest = scan.nextDouble();
        double newBalance = money + (money * interest / 100);
        System.out.print("\nNew Balance: " + newBalance);
    }
}
