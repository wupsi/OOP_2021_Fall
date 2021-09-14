import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        
        if(n > m) System.out.print(1);
        else if(n < m) System.out.print(2);
        else System.out.print(0);
    }
}
