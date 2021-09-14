import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x, mx = -1000000;

        for(int i = 0; i < n; i++){
            x = input.nextInt();
            mx = Math.max(mx, x);
        }
        System.out.print(mx);     
    }
}
