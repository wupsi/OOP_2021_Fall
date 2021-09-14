import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        long sum = 0;

        for(int i = 0; i < n - n % 2; i += 2){
            arr[i] = input.nextInt();
            arr[i + 1] = input.nextInt();
        }
        if(n % 2 == 1) arr[n - 1] = input.nextInt();

        for(int i = 0; i < n - n % 2; i += 2)
            System.out.print(arr[n - i - 1] + " " + arr[n - i - 2] + " ");
        if(n % 2 == 1) System.out.print(arr[0] + " ");
    }
}