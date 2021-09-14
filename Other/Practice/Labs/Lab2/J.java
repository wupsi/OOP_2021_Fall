import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x, zero = 0;

        for(int i = 0; i < n; i++){
            x = input.nextInt();
            while(x != 0){
                if(x % 10 == 0) zero++;
                x /= 10;
            }
        }
        System.out.print(zero);     
    }
}
