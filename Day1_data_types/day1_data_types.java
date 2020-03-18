import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day1_data_types{

    public static void main(String[] args) {
      int i = 4;
      double d = 4.0;
      String s = "HackerRank ";

      /* Declare second integer, double, and String variables. */
      Scanner scan = new Scanner(System.in);

      /* Declare second integer, double, and String variables. */
      int i_tmp;
      double d_tmp;
      String inputString="";

      /* Read and save an integer, double, and String to your variables.*/

      i_tmp = scan.nextInt();
      d_tmp = scan.nextDouble();

      // TRICK HERE!!!
     // The previous line (scan.nextDouble() does not provide a newline or"\n ) so we should add this command :
      scan.nextLine(); // read the rest of the line of input (newline character after the double token).
      inputString += scan.nextLine();
        // Or we can use >> d_tmp =  Double.parseDouble(scan.nextLine());

      

      // Note: If you have trouble reading the entire String, please go back and          review the Tutorial closely.

      // Close the scanner object, because we've finished reading
      // all of the input from stdin needed for this challenge.

      /* Print the sum of both integer variables on a new line. */
      i = i_tmp+i;
      System.out.println(i);


      /* Print the sum of the double variables on a new line. */
      d = d_tmp+d;
      d = d*1.0;
      System.out.println(d);

      /* Concatenate and print the String variables on a new line;
        the 's' variable above should be printed first. */
      s += inputString;
      System.out.println(s);
      scan.close();
  }
}
