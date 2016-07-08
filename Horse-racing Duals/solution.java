import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] horses = new int[N];
        
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            horses[i] = pi;
        }
        Arrays.sort(horses);
        
        int min_diff = 10000000;
        int temp_diff = 0;
        for(int i = 0; i < N-1; i++){
            int temp = 0;
            //System.out.println(horses[i]);
            temp_diff = Math.abs(horses[i+1]-horses[i]);
            if(temp_diff < min_diff){
                min_diff = temp_diff;   
            } 
        }  
		
        System.out.println(min_diff);
    }
}