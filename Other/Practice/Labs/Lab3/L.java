import java.util.Scanner;
import java.util.Arrays;

public class L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[100000];

        for(int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        
        int m = input.nextInt();
        for(int i = n; i < n + m; i++)
            arr[i] = input.nextInt();
        
        Arrays.sort(arr, 0, n + m);
        for(int i = 0; i < n + m; i++)
            System.out.print(arr[i] + " ");
    }
}
