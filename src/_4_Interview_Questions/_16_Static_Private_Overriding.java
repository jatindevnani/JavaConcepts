package _4_Interview_Questions;

public class _16_Static_Private_Overriding {
    //Private methods cannot be overridden because there visibility is limited to the parent class only.
    //Static methods cannot be overridden because static methods have nothing to do with the object
    //It is a class level method. If the child class specifies a method with same signature as the
    //static method of our parent class, it can exist without throwing a compilation error.
    //This phenomena is known as method hiding.
}
