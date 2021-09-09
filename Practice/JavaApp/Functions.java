import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        func(n);
        System.out.println();
        System.out.print(n + " is equal to zero?\n" + isZero(n));
    }

    public static void func(int a) {
        while(a != 0){
            System.out.print(a + " ");
            a--;
        }
        System.out.println();
        System.out.print(a + " is equal to zero?\n" + isZero(a));
    }

    public static boolean isZero(int a) {
        return a == 0;
    }
}