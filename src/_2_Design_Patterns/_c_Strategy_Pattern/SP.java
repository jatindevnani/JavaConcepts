package _2_Design_Patterns._c_Strategy_Pattern;

public class SP {
    public static void main(String[] args) {
        //The main thing that functional interface facilitates is the ability to
        //change the implementation at runtime

        //Lets say we have an interface called
        //      |
        //      |
        //    Operations

        //Operations Interface can perform operation on 2 given numbers
        //We can extend the operations interface using concrete classes like in example (A) below

        //Demonstration of (A)
        Context context = new Context(new multiply());
        context.executeStrategy(2,5);
    }

}

@FunctionalInterface
interface Operations {
    void doMagic(int a, int b);
}

// (A) Concrete classes
class add implements Operations {

    @Override
    public void doMagic(int a, int b) {
        System.out.println(a+b);
    }

}


class multiply implements Operations {
    @Override
    public void doMagic(int a, int b) {
        System.out.println(a*b);
    }
}

