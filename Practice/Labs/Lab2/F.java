import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), sum = 0;

        while(n != 0){ 
            sum += n;
            n--;
            }
        System.out.print(sum);     
    }
}
