import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        
        if(n <= m) System.out.print(2);
        else System.out.print((2 * n) % m == 0 ? (2 * n) / m : (2 * n) / m + 1);
    }
}
