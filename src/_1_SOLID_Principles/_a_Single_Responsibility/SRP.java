package _1_SOLID_Principles._a_Single_Responsibility;

public class SRP {
    //The Single Responsibility states that one class should only have one responsibility and only one reason
    //to change
    public static void main(String[] args) {

        //The bad example
        HDD hdd1 = new HDD(4096);
        hdd1.storeStuff();
        hdd1.workAsRam();

        //Example following the SRP
        Memory hdd = new SR_HDD(4096);
        hdd.useMemory();

        Memory ram = new SR_RAM(4096);
        ram.useMemory();

    }
}

class HDD {
    private int space;

    public HDD (int space) {
        this.space = space;
    }

    void storeStuff() {
        System.out.println("I am storing stuff now");
    }

    //This violates the SPR. Here our HDD class is doing two Things.
    //It is storing stuff for us as well as acting as the volatile memory i.e. RAM
    void workAsRam() {
        System.out.println("I am now working as RAM");
    }
}

//To fix this we will divide the above class in two parts

interface Memory {
    void useMemory();
}

class SR_HDD implements Memory {

    private int memory;

    public SR_HDD (int memory) {
        this.memory = memory;
    }

    @Override
    public void useMemory() {
        System.out.println("I am Hard disk and I just store stuff");
    }

}

class SR_RAM implements Memory {

    private int memory;

    public SR_RAM (int memory) {
        this.memory = memory;
    }

    @Override
    public void useMemory() {
        System.out.println("I am RAM and I am fast but temporary memory");
    }

}
