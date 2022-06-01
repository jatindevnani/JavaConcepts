package _4_Interview_Questions;

public class _14_String_StringBuilder_StringBuffer {

    public _14_String_StringBuilder_StringBuffer() {

    }

    //String is immutable
    //String buffer and string builder are mutable
    //String buffer is synchronized i.e. thread safe
    //String builder is not thread safe hence faster.

    public static void main(String[] args) {
        //Changes can be made to the same string
        //This is not thread safe
        StringBuilder stringBuilder = new StringBuilder("Jatin");
        stringBuilder.append(" is 25");
        System.out.println(stringBuilder);

        //Changes can be made to the same string
        //This is thread safe
        StringBuffer stringBuffer = new StringBuffer("Jatin");
        stringBuffer.append(" is 25");
        System.out.println(stringBuffer);

        //Any modification made on a string will return a new string.
        String str = "Jatin";
        str = str + " is 25";
        System.out.println(str);

        //Conversion from one to another

        //Conversion from string to sb or sbr
        String string = "this is string";

        //Simply use pass the string in the constructor
        StringBuilder convertedFromString = new StringBuilder(string);
        StringBuffer convertedSB = new StringBuffer(string);

        //Conversion from string buffer / builder to a String
        String string2 = convertedFromString.toString();
        String string3 = convertedSB.toString();

        //Conversion from string buffer to builder and vice versa
        //Simply convert the argument to String using the toString

        StringBuilder builder = new StringBuilder(convertedSB);
        System.out.println(builder.toString());

    }

}
