import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt(), x, cnt = 0;

        for(int i = 0; i < n; i++){
            x = input.nextInt();
            if(x <= m) cnt++;
            else break;
        }
        System.out.print(cnt);
    }
}
