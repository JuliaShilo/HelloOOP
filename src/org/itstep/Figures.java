package org.itstep;

public class Figures {
    public static void main(String[] args) {
        Triangle triangle2 = new Triangle();
        triangle2.height = 5.5;
        triangle2.base = 7.0;
        System.out.println(triangle2.height);
        System.out.println(triangle2.base);

        Square square2 = new Square();
        square2.side = 3.5;
        System.out.println(square2.side);

        Circle circle2 = new Circle();
        circle2.radius = 2.5;
        System.out.println(circle2.radius);

    }
}
