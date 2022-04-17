package _1_SOLID_Principles._b_Open_Closed;

public class OCP {
    public static void main(String[] args) {

        //The Open Close Principle states that our code should be closed for modification but
        //Open for Extension
        //This can be achieved by using loose coupling and extending existing classes and interfaces
        //without making changes to the existing code


    }
}

//Say we have a television that works as a tv only for now
class badOCP_myTelevision {
    //A tv can have the following properties
    private String model;
    private int refreshRate;
}

//Now say we buy a new television that can also work as a gaming monitor
//Lets say this new TVMonitor has a new property i.e. SyncType (GSync and FreeSync)

//It doesn't make sense to go back and make changes to our existing class
//But we do not have a choice since from the beginning we went for a concrete class i.e. MyTelevision

//The better approach would be to make an interface or abstract class

abstract class goodOCP_Screen {
    private String model;
    private int refreshRate;

    public goodOCP_Screen(String model, int refreshRate) {
        this.model = model;
        this.refreshRate = refreshRate;
    }
}

class Television extends goodOCP_Screen {
    private String remoteType;

    public Television (String model, int refreshRate, String remoteType) {
        super(model, refreshRate);
        this.remoteType = remoteType;
    }
}

class SuperCoolNewGamingTelevision extends goodOCP_Screen {
    private String syncType;

    public SuperCoolNewGamingTelevision(String model, int refreshRate, String syncType) {
        super(model, refreshRate);
        this.syncType = this.syncType;
    }
}

//Now we can easily extend the types of Screns we buy
