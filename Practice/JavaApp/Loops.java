import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i = 0; i < n; i++)
            System.out.print("i = " + i + " ");
        System.out.println();
        
        int j = 0;
        while(j < n) {
            System.out.println("j = " + j + " ");
            j++;
        }
        
        int k = 0;
        do{
            System.out.println(k);
            k++;
        }while(k < 10);
    }
}