import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String");
        String s = scan.nextLine();
        char[] ch = s.toCharArray();
        boolean ok = true;
        for(int i = 0; i < s.length(); i++){
            if(ch[i] != ch[s.length() - i - 1]){
                ok = false;
                break;
            }
        }
        if(ok){
            System.out.print("Palindrom");
        }
        else{
            System.out.print("Not Palindrom");
        }
    }
}
