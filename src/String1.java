import java.lang.*;
import java.util.*;
public class String1 {
    // Reverse a string
    static void reverseString(String s){
        StringBuilder str = new StringBuilder(s);
        String result = str.reverse().toString();
        System.out.println(result);
    }

    // Check string palindrome
    static void palindromeString(String s){
        StringBuilder str = new StringBuilder(s);
        String result = str.reverse().toString();
        if(s.equals(result)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not palindrome");
        }
    }

    // Count words
    static void countWords(String s){
        String trimmed = s.trim();
        int len = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
        System.out.println("Length: " + len);
    }

    // Contains equal character or not
    static void checkEqual(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Same");
        } else{
            System.out.println("Not same");
        }
    }

    // Swap Strings
    static void swapStrings(String s1, String s2){
       String str1 = s1.concat(s2);

       String str2 = str1.substring(0,  str1.length() - s2.length());
       str1 = str1.substring(str2.length());

       System.out.println(str1);
       System.out.println(str2);
    }

    public static void main(String[] args) {
        reverseString("Hi i am Rahul");
        palindromeString("madam");
        countWords("I am Rahul Sarkar the CEO of ZOVO");
        checkEqual("rahul", "luhar");
        swapStrings("Rahul Sarkar", "Elon Musk");
    }
    
}
