import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x, even = 0, odd = 0;

        for(int i = 0; i < n; i++){
            x = input.nextInt();
            if(x % 2 == 0) even++;
            else odd++;
        }
        System.out.print(even + " " + odd);     
    }
}
