import java.io.*;
import java.lang.Math;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {

    // public static String toString(int i);

      public static Integer CountConsecOne(int dec){
        int prev = 0;
        int countConsecOne_tmp = 0;
        int maxCount_consecutive_one = 0;

        while (dec > 1){

          if ( prev == 1 && dec % 2 == 1){
              countConsecOne_tmp += 1;
              if (maxCount_consecutive_one <= countConsecOne_tmp){
                //Update Maximum
                maxCount_consecutive_one = countConsecOne_tmp;
              }
          }
          else if ( prev == 0 ){
            countConsecOne_tmp = 0;
          }
          //Update
          dec = dec / 2 ;
          if( dec % 2 == 1){
            prev = 1;
          }else if( dec % 2 == 0){
            prev = 0;
          }
        }

        if ( prev == 1 && dec % 2 == 1){
            countConsecOne_tmp += 1;
            if (maxCount_consecutive_one <= countConsecOne_tmp){
              //Update Maximum
              maxCount_consecutive_one = countConsecOne_tmp;
            }
        }
        return maxCount_consecutive_one;
    }

    public static String DecToBin( int dec){
      //Base case:
      if (dec  <= 1 ){
        return Integer.toString( dec % 2 ) ;
      }else{
        return DecToBin(dec/2) + Integer.toString(dec % 2 ) ;
      }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Decimal :" + n +" => Binary :" + DecToBin( n) );
        System.out.println( "Maximum consecutive one :" +CountConsecOne(n) );
        // scanner.close();
    }
  }
