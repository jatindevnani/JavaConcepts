package _2_Design_Patterns._b_Singleton_Pattern;

public class SP_Eager_Loading {
    public static void main(String[] args) {
        SingletonEL eagerLoading = SingletonEL.getUniqueInstance();
        SingletonEL anotherVersion = SingletonEL.getUniqueInstance();
        System.out.println(eagerLoading == anotherVersion); //TRUE
    }
}

//This is eager loading because the instance of SingletonEL is created
//upon loading of the class by the JVM
//Singleton class with Eager loading
class SingletonEL {
    private static SingletonEL instance = new SingletonEL();

    private SingletonEL() {}

    public static SingletonEL getUniqueInstance() {
        return instance;
    }

    public void printGibberish() {
        System.out.println("DFLNDFL");
    }
}