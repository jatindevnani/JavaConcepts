package _2_Design_Patterns._a_Factory_Pattern;

import javax.swing.plaf.metal.MetalIconFactory;

public class FP {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(SHAPES.SQUARE, 5);
        Shape square = ShapeFactory.getShape(SHAPES.CIRCLE, 10);

        circle.describeShape();
        circle.getArea();

        square.describeShape();
        square.getArea();

    }
}

class ShapeFactory {
    public static Shape getShape(SHAPES shapesEnum, int lengthOfSideOrRadius) {
        if(shapesEnum.equals(SHAPES.CIRCLE)) {
            return new Circle(lengthOfSideOrRadius);
        } else if (shapesEnum == SHAPES.SQUARE) {
            return new Square(lengthOfSideOrRadius);
        } else {
            throw new IllegalArgumentException("Shape doesnt exist");
        }
    }
}

enum SHAPES {CIRCLE, SQUARE};

interface Shape {
    void describeShape();
    int getArea();
}

class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void describeShape() {
        System.out.println(getClass().getName() + " has a radius of " + this.radius);
    }

    @Override
    public int getArea() {
        return (int)Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private int side;

    public Square (int side) {
        this.side = side;
    }

    public void describeShape() {
        System.out.println(getClass().getName() + " has all sides equal to " + this.side);
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
