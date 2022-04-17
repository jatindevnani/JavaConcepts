package _1_SOLID_Principles._d_Interface_Segregation;

public class IS {

    //Interface Segregation states that the larger interfaces should be split into smaller interfaces.
    //By doing so, we make sure that the implementing classes only need to be concerned about implementing
    //the methods that are of interest to them

    //Let us start with an example that doesn't follow the ISP
}

interface WithoutLS_WebsiteManager {
    void designFrontend();
    void writeBusinessLogic();
    void manageDatabase();
}

class frontendEngineer implements WithoutLS_WebsiteManager{

    @Override
    public void designFrontend() {
        //.... I am great at React ...EZ work
    }

    @Override
    public void writeBusinessLogic() {
        //Wait what?? I don't know how to write Business logic :(
    }

    @Override
    public void manageDatabase() {
        //More of this?? OMG... I can't do this anymore! T_T
    }
}

//This is a bad example because different people should ideally be doing all the above-mentioned
//stuff. So, when the fronted designer implements the website manager interface he will also
//have to provide implementation to the writeBusiness method and the manageDatabase methods
//Even though those are to be done by the Backend engineer and the database enginer.

//Fixing this issue is very easy. We just need to make sure that there should be no wasted
//Methods upon implementation.

interface LS_FrontendManager {
    void designFrontend();
}

interface LS_BackendManager {
    void writeBusinessLogic();

}

interface LS_DatabaseManager {
    void manageDatabase();
}

class FrontendEngineer implements LS_FrontendManager{

    @Override
    public void designFrontend() {
        //...Bring it on. I am the god of React MUHAHAHAHa
    }
}

class backendDevWithDBKnowledge implements LS_BackendManager, LS_DatabaseManager {

    @Override
    public void writeBusinessLogic() {
        //Like the title says, I am a backend engineer and can write great logic
    }

    @Override
    public void manageDatabase() {
        //Since I am a great developer I also have mastery in managing databases
    }
}
