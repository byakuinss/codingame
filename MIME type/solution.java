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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        
        HashMap<String, String> ext = new HashMap<String, String>();
        ArrayList<String> files = new ArrayList<String>();
        
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            in.nextLine();
            ext.put(EXT.toLowerCase(),MT);
            //System.out.println(i+". EXT:" + EXT);
            //System.out.println(i+". MT:" + MT);
        }
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            files.add(FNAME.toLowerCase());
            //System.out.println(i+". FNAME:" + FNAME);
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");)
        for(String file: files){
            int pointer = file.lastIndexOf(".");
            String file_s = file.substring(pointer+1);
            if(pointer == -1 || !file_s.matches("\\w+")){
                System.out.println("UNKNOWN");
            } 
            else{
                
                if(ext.keySet().contains(file_s)){
                    System.out.println(ext.get(file_s));
                } 
                else {
                    System.out.println("UNKNOWN");
                }
            }
        }

        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
        //System.out.println("UNKNOWN");
    }
}