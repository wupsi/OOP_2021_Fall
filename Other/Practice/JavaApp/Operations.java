import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num_1 = input.nextFloat(), num_2 = 342.23f, res;
        res = num_1 + num_2;
        res += 45f;
        System.out.print(res);
    }
}