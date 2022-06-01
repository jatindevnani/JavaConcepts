package _4_Interview_Questions;

public class _5_Constructor_Overloading {

    //Constructor Overloading is the process of creating multiple constructors with the same name
    //for a given class. The compiler differentiates between these constructors on the basis of
    //the number of parameters and/or the type of the parameters.

    private int var1;
    private String var2;

    public _5_Constructor_Overloading () {
        //Non-Parameterized constructor
    }

    public _5_Constructor_Overloading (int var1) {
        //Constructor with one variable only
        this.var1 = var1;
    }

    public _5_Constructor_Overloading (String var2) {
        //Constructor with one variable but of different type
        this.var2 = var2;
    }

    public _5_Constructor_Overloading (int var1, String var2) {
        //Constructor with two values
        this.var1 = var1;
        this.var2 = var2;
    }


}
