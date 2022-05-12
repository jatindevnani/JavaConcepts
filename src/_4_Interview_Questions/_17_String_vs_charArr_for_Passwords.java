package _4_Interview_Questions;

public class _17_String_vs_charArr_for_Passwords {
    //Char[] should be preferred for storing confidential information such as passwords
    //because -
    //_a_ Once a string is created in the string constant pool for a long time there is no way it is going
    // to be removed before garbage collection. This gives the hackers a window of opportunity to gain
    // sensitive information because anyone who has access to the memory dump can find the password in
    // clear text. We cannot encrypt the password as string either since they are immutable and will return
    // a new string everytime. When we use a char[] we can change the inner contents of the array.

    //_b_With String there is always a risk of printing plain text in a log file or console but if you use
    // an Array you won't print contents of an array, but instead its memory location gets printed. Though
    // not a real reason, it still makes sense.
}
