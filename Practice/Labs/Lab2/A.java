import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n == 0)
            System.out.print("None");
        else if(n % 2 == 0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}
