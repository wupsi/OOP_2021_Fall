import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        if(x % 2 == 0 && x != 0) System.out.println("EVEN");
        else if(x == 0) System.out.println("x is 0");
        else System.out.println("ODD"); 

        System.out.println(x % 2 == 0 ? "YES" : "NO");
    }
}