import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x, seven = 0;

        for(int i = 0; i < n; i++){
            x = input.nextInt();
            if(x % 10 == 7) seven++;
        }
        System.out.print(seven);     
    }
}
