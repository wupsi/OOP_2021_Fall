import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), mx = -1000000;

        for(int i = 0; i < n; i++){
            mx = Math.max(mx, input.nextInt());
        }
        System.out.print(mx);     
    }
}
