package com.company;

public class ResizeableTest {
    public static void main(String[] args) {
        //test retangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.resize(0.8);
        System.out.println(rectangle);
        //test Circle
        Circle circle=new Circle();
        System.out.println(circle);
        circle.resize(0.7);
        System.out.println(circle);
        //Square
        Square square=new Square(2);
        System.out.println(square);
        square.resize(0.5);
        System.out.println(square);
    }
}
