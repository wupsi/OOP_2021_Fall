import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), cnt = 0;

        for(int i = 0; i < n; i++){
            if(input.nextInt() > 0) cnt++;
        }        
        System.out.print(cnt);
    }
}