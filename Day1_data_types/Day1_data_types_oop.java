
// When considering what you can do with Java, many developers think of building:

// Application servers
// Web applications
// Unit tests
// Mobile applications
// Desktop applications
// Enterprise applications

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class day1_data_types {
  int i = 4;
  double d = 4.0;
  String s = "HackerRank ";

  public void Print_var(){
    System.out.println(i);
    System.out.println(d);
    System.out.println(s);

  }
  public void Addition_integer(){
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    i = number+i;

  }
  public void Addition_double(){
    Scanner scan = new Scanner(System.in);
    double number = scan.nextDouble();
    d = number+d;
    d = d*1.0;
  }


    public void Concastinate_string(){
    Scanner scan = new Scanner(System.in);
    String str_temp = scan.next();
    s = str_temp + s;
    }

    public static void main(String[] args) {

      day1_data_types Outputs = new day1_data_types();

      Outputs.Addition_integer();
      Outputs.Addition_double();
      Outputs.Concastinate_string();
      Outputs.Print_var();



    }
}
