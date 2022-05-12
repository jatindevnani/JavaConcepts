package _4_Interview_Questions;

public class _1_Local_variable_vs_Instance_variable {

    //_1_This is an instance variable
    //_2_It doesn't need to be given an initial value
    //_3_It is declared outside any method or constructor but inside the class.
    //_4_Each object of the class will have its own copy of instance variables
    //_5_Modification of one instance variable of a class will not affect instance variable of another class
    //_6_Created when the object of this class is created and destroyed when the object is destroyed
    //_7_Supports Access modifiers as well
    private int instanceVariable;

    public _1_Local_variable_vs_Instance_variable () {

    }

    public void localScope() {
        //_1_ This is a local variable
        //_2_ Initialisation of a local variable is mandatory
        //_3_ Created when the method is called and the instantiation is done
        //_4_ Destroyed when the control goes back to the caller method
        //_5_ They are created inside a block of code, a method or a constructor
        //_6_ Access is limited to the scope of the method in which it is declared
        //_7_ It doesn't support any access modifiers
        int localVariable;

        //Allowed
        System.out.println(instanceVariable);

        //Not allowed (BECAUSE IT WAS NOT INITIALISED)
        //System.out.println(localVariable);
    }

}
