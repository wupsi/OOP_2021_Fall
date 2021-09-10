import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i <= n; i *= 2) System.out.print(i + " ");
    }
}
