import java.io.*;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void OddChar(String inputStr){
      int index = 0 ;
      while(index < inputStr.length()) {
        if(index % 2 == 0){
            char temp = inputStr.charAt(index);
            System.out.print(temp);
          }
          index++;
      }
    }

    public static void EvenChar(String inputStr){
      int index = 0 ;
      while(index < inputStr.length()) {
        if(index % 2 != 0){
            char temp = inputStr.charAt(index);
            System.out.print(temp);
          }
          index++;
      }
    }

    public static void main(String[] args) {
        /* Enter your code here.  Print output to STDOUT. Your class should be named Solution. */

        // Read a number of input string
        int n_input = scanner.nextInt();
        String[] strArr= new String[n_input];

        // Read the string inputs
        int index = 0;
        while(index < strArr.length) {
            strArr[index] = scanner.next();
            index++;
        }
        // System.out.println("==========test==========");
        for(String s : strArr ){
          // System.out.println(s);
          OddChar(s);
          System.out.print(" ");
          EvenChar(s);
          System.out.println();
       }

    }
}
