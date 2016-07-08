import java.util.*;
import java.io.*;
import java.math.*;
import java.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        String result = "";
        String str_c = "";
        for(int i=0; i < MESSAGE.length(); i++){
            char c = MESSAGE.charAt(i);
            //System.out.println("c="+c);
            int int_c = (int)c;
            //System.out.println("int c="+int_c);
            String bin_c = Integer.toBinaryString(int_c);
            //System.out.println("Binary c="+bin_c);
            bin_c = String.format("%07d",Integer.parseInt(bin_c));
            str_c += bin_c;
            //System.out.println("String c="+str_c);
            //System.out.println("String c="+str_c);
        }
            String groups[] = str_c.split("(?<=1)(?=0)|(?<=0)(?=1)");
            int count = 0;
            
            for (String group : groups){
                
                //System.out.println(group);
                if(group.contains("0")){
                    result += "00 ";
                } else{
                    result += "0 ";
                }
                
                for(int j=0; j < group.length(); j++){
                    result += "0";
                }
                if(count < groups.length-1){
                    result += " ";
                    count ++;
                }
            }
        System.out.println(result);
    }
}