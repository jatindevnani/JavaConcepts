package _4_Interview_Questions;

public class _3_equals_method_vs_equals_binary_operator {
    public static void main(String[] args) {

        // == operator the memory addresses of the two objects
        // equals() method compares the content of the objects

        // == operator is a binary operator
        // equals() method is defined in the object class

        // equals() method needs to be overridden, if it is not overridden
        // the method closest to the parent is considered

        // The default implementation provided by the object class internally
        // uses == to check the addresses of the objects for equality


        String x = new String("jatin");
        String y = "jatin";
        System.out.println(x.equals(y));
    }
}
