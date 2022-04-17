package _1_SOLID_Principles._c_Liskov_Substitution;

public class LS {
    public static void main(String[] args) {
        //Liskov's Substitution Principle states that if class A is subtype of class B then
        //We should be able to replace class B with class A without breaking the functionality
        //of our program

        //Bad Liskov Substitution
    }
}

//Our class creates objects of keypad phones which have keys (DUH!)
interface WithoutLS_Phone {
    public void pressKey(String key);
    public void makeCall(int numberToCall);
}

//We have a phone with

//Now we need a new phone which is a touch screen
class WithoutLiskovSubstitution_KeyPad_Phone implements WithoutLS_Phone{

    @Override
    public void pressKey(String key)  {
        System.out.println(key + " was Pressed");
    }

    @Override
    public void makeCall(int numberToCall) {
        System.out.println("Calling " + numberToCall);
    }
}

//Now what if we want a touchscreen phone? they don't have a keypad
class WithoutLiskovSubstitution_TouchScreen_Phone implements WithoutLS_Phone{

    //This is violating the LSP because We do not have physical keys in Touchscreen phones
    //So this cannot substitute its parent
    @Override
    public void pressKey(String key)  {
        System.out.println(key + " was Pressed");
    }

    @Override
    public void makeCall(int numberToCall) {
        System.out.println("Calling " + numberToCall);
    }
}

//To fix the above issue we can make our interfaces better so that we can consider all kinds of phones
interface LS_Phone {
    public void makeCall(int numberToCall);
}

interface LS_KeyPadPhones extends LS_Phone {
    public void pressKey(String key);
}

interface LS_SmartPhones extends LS_Phone {
    public void touchScreen(int fingers);
}

class SamsungGalaxy11 implements LS_SmartPhones {

    @Override
    public void makeCall(int numberToCall) {
        System.out.println("Calling " + numberToCall);
    }

    @Override
    public void touchScreen(int fingers) {
        System.out.println("Using the screen with " + fingers + " Fingers");
    }
}