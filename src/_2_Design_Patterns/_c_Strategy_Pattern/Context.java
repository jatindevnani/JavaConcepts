package _2_Design_Patterns._c_Strategy_Pattern;

public class Context {
    Operations operation;

    public Context(Operations operation) {
        this.operation = operation;
    }

    public void executeStrategy(int a, int b) {
        this.operation.doMagic(a, b);
    }
}
