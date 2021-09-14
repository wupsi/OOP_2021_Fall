import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum = 0;

        for(;;){
            sum += input.nextInt();
        }

        System.out.print(sum);
    }
}
