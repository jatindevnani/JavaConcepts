package _2_Design_Patterns._b_Singleton_Pattern;

public class SP_Lazy_Loading {
    public static void main(String[] args) {
        SingletonLL eagerLoading = SingletonLL.getUniqueInstance();
        SingletonLL anotherVersion = SingletonLL.getUniqueInstance();
        System.out.println(eagerLoading == anotherVersion); //TRUE
    }
}

//Singleton class with lazy loading
//This is lazy loading because the instance is not created upon the startup of the program
//We make this volatile to stop the caching
//We make our getUniqueInstance Synchronized to make our program stay
//consistent in the multithreaded environment

class SingletonLL {
    private static volatile SingletonLL instance = null;

    private SingletonLL() {};

    public static synchronized SingletonLL getUniqueInstance() {
        if(instance == null) {
            instance = new SingletonLL();
        }
        return instance;
    }
}