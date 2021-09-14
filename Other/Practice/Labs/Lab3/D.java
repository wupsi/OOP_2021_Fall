import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), mx = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            if(arr[i] > arr[mx]) mx = i;
        }
        System.out.print(mx + 1);     
    }
}
