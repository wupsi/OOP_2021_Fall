import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), l = input.nextInt(), r = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.print(l <= i+1 && i+1 <= r ? arr[r-l-i+1] + " " : arr[i] + " ");
        }            
    }
}
