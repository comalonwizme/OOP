import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your score(0-100): ");
        int n = scan.nextInt();
        System.out.print("Your grade is ");
        if(n > 94){
            System.out.print("A");
            return;
        }
        else if(n >= 90){
            System.out.print("A-");
            return;
        }
        else if(n >= 84){
            System.out.print("B+");
            return;
        }
        else if(n >= 80){
            System.out.print("B");
            return;
        }
        else if(n >= 75){
            System.out.print("B-");
            return;
        }
        else if(n >= 70){
            System.out.print("C+");
            return;
        }
        else if(n >= 65){
            System.out.print("C");
            return;
        }
        else if(n >= 60){
            System.out.print("C-");
            return;
        }
        else if(n >= 55){
            System.out.print("D+");
            return;
        }
        else if(n >= 50){
            System.out.print("D");
            return;
        }
        else{
            System.out.print("F");
            return;
        }

    }
}
