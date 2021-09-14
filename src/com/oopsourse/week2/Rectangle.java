package com.oopsourse.week2;

public class Rectangle {
    int height, width;

    public static boolean squarecheck(int height, int width){
        return height == width;
    }

    public static int area(int height, int width) {
        return height * width;
    }

    public static int perimeter(int height, int width) {
        return 2 * (height + width);
    }
}
