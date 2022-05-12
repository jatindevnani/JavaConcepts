package _4_Interview_Questions;

public class _8_Garbage_Collection {

    //Garbage Collection in java is an automatic process where JVM constantly
    //monitors for unreferenced objects or unreachable objects. The main purpose of
    //garbage collection is to free up memory space for program execution.

    //Ways to make an object eligible for garbage collection-

    //_1_By nullifying the reference variable
    //_2_By reassigning the reference variable
    //_3_By creating objects inside a method
    //_4_Island of Isolation (expand later)

    /*
    * In Java, garbage collector automatically reclaims the memory for reuse and helps in eliminating memory
    *  leaks and other memory-related problems. When an object is no longer used, the Java garbage collector
    *  reclaims the underlying memory and reuses it for future object allocations. JVM manages the heap area
    *  for all objects and as long as the object is being referenced, it is considered alive. Once an object
    *  is no longer referenced or not reachable by an application, the garbage collector removes this object
    *  and reclaims the unused memory.

        JVM uses a mark and sweep algorithm to determine which objects are no longer in use by the application.
    *  This is a two-step process:

    First, the algorithm scans all object references and marks those objects which are found as alive.
    It sweeps or reclaims all the heap memory that is not occupied by these marked objects.*/
    }
