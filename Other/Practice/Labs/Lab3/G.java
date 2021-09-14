import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), mx = 0, mn = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n - n % 2; i += 2){
            arr[i] = input.nextInt();
            arr[i + 1] = input.nextInt();
            
            if(arr[i] > arr[mx]) mx = i;    
            if(arr[i + 1] > arr[mx]) mx = i + 1;
            
            if(arr[i] < arr[mn]) mn = i;
            if(arr[i + 1] < arr[mn]) mn = i + 1;
        }
        
        if(n % 2 == 1) arr[n - 1] = input.nextInt();
        if(arr[n - 1] > arr[mx]) mx = n - 1;
        if(arr[n - 1] < arr[mn]) mn = n - 1;

        for(int i = 0; i < n; i++){
            if(arr[i] == arr[mx]) System.out.print(arr[mn] + " ");
            else System.out.print(arr[i] + " ");
        }
    }
}
