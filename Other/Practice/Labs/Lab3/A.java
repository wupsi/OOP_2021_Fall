import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x;

        for(int i = 0; i < n; i++){
            x = input.nextInt();
            if(x % 2 == 1)
                System.out.print(x + " ");            
        }        
    }
}