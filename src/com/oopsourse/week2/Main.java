package com.oopsourse.week2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.print("Enter height: ");
        rec.height = input.nextInt();

        System.out.print("Enter weight: ");
        rec.width = input.nextInt();

        System.out.print("Is this square? " + Rectangle.squarecheck(rec.height, rec.width));
        System.out.print("\nRectangle area: " + Rectangle.area(rec.height, rec.width));
        System.out.print("\nRectangle perimeter: " + Rectangle.perimeter(rec.height, rec.width));
    }
}
