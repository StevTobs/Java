//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,String> phoneNumber = new HashMap<String,String>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here

            // Putting things inside our phone book
            phoneNumber.put(name , Integer.toString(phone));

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if ( phoneNumber.get(s) != null && ! phoneNumber.get(s).isEmpty() ){
              System.out.println(s+"="+phoneNumber.get(s));

            }
            else {
              System.out.println("Not found");
            }
        }
        in.close();
    }
}
