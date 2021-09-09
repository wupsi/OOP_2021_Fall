import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print(n % 2 * 8 + n % 4 / 2 * 4 + n % 8 / 4 * 2 + n / 8);
    }
}
