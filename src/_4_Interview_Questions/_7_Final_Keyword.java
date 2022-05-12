package _4_Interview_Questions;

public class _7_Final_Keyword {
    //Making a variable final;
    //final int x;
    //Once a variable is marked final its value cannot be reassigned. It becomes constant.
    //If a final instance variable has not been reassigned its value can only be assigned by the constructor

    //Making a method final
    //If a method is made final it cannot be overridden by any of the subclasses
    //The constructor method cannot be overridden because when a class is inherited
    //the constructor method is not inherited. So it doesn't make sense to override it
    //The compiler will give the following error - modifier final not allowed here

    //Making class final
    //Making the class final will prohibit any other class from inheriting this class.
    //But this class can still continue to inherit other classes.
}
