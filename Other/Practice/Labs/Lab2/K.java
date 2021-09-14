import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), i = 1;

        while(i * i <= n){
            System.out.println(i * i);
            i++;
        }
    }
}
