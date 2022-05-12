package _4_Interview_Questions;

public class _11_Super_Keyword {

    //Super keyword is used by the subclas of a class to call the following -
        //1) The constructor method of the parent class
        //2) The Specific variables of the parent class
        //3) The parent class methods for the overridden methods.

    public static void main(String[] args) {
        Child child = new Child();
        child.func();
    }
}

class Parent {

     int x = 1;
     int y = 2;

    Parent () {

    }

    public void func() {
        System.out.println("This is in parent");
    }
}

class Child extends Parent {
    private int x = 201;
    private int z = 301;

    Child() {
        super();
    }

    @Override
    public void func() {
        System.out.println("This is Child");
        System.out.println("Current class: " + x);
        System.out.println("Parent class: " + super.x);
    }
}