import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Init rec = new Init();
        Scanner input = new Scanner(System.in);
        rec.height = input.nextInt();
        rec.width = input.nextInt();

        System.out.print("Rectangle size: " + rec.height + "x" + rec.width); 
    }
}
class Init {
    
    int height, width;
    
}