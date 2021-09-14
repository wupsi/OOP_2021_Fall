import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        switch(input.nextInt()){
            case 1: 
                System.out.print("case 1");
                break;
            case 2:
                System.out.print("case 2");
                break;
            case 3:
                System.out.print("case 3");
                break;
            default:
                System.out.print("default");
        }        
    }
}