import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), l = input.nextInt(), r = input.nextInt();
        long sum = 0;

        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            if(l <= i+1 && i+1 <= r) sum += x;
        }
        System.out.print(sum);
    }
}
