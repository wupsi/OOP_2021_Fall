import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        if(n % 2 == 1)
            System.out.print("Super");
        else if(n >= 2 && n <= 5)
            System.out.print("Not Super");
        else if(n >= 6 && n <= 20)
            System.out.print("Super");
        else if(n > 20) 
            System.out.print("Not Super");
    }
}
