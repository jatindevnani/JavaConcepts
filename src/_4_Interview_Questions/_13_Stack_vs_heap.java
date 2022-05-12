package _4_Interview_Questions;

public class _13_Stack_vs_heap {
    //Which of the following becomes eligible for garbage collector?
    //Stack Memory
    //It is the memory that holds the primitive data types and references to the objects created in the heap
    //memory. It is Last in first out (LIFO) memory. Methods added at the call stack gets allocated the memory
    //for its local variables and when its execution finishes, the memory is deallocated and assigned to the
    //next method. If stack memory is full, java runtime throws java.lang.StackOverFlowError

    //Heap Memory
    //All the objects in java are actually created in the heap memory. When an object is created, memory is
    //allocated to that object in heap with its reference been saved in the stack memory. Objects created in
    //the heap are globally accessible and it is larger in size than stack memory. If the memory is full, java
    //throws java.lang.OutOfMemoryError
    //After the program is run, JRE (Java runtime environment) loads all classes into heap memory. Following are
    //the sequence of operation at each line:
}
