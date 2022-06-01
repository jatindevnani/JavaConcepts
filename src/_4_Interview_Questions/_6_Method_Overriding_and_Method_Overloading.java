package _4_Interview_Questions;

public class _6_Method_Overriding_and_Method_Overloading {

}

class Overloading {
    //_1_Method overloading is one way to achieve polymorphism, it is compile-time polymorphism.
    //_2_It is made possible by creating multiple methods having same name but different signatures.
    //_3_Compiler differentiates between these methods having the same name by the difference in
    //   the parameter types and the number of parameters.
    //_4_Method overloading takes place inside the class only.
    //_5_Return type, of a method can or can not be the same but the number or type of the parameters must be different
}

class Overriding {
    //_1_It is another way to achieve polymorphism. It is runtime polymorphism.
    //_2_Overriding a method means creating the method with the same name and the same signature
    //   in the subclass for an already existing method in the parent class.
    //_3_Method overriding always needs inheritance.
    //_4_It is determined at the runtime which class object will be called.
    //_5_Return type MUST BE THE SAME.
}
