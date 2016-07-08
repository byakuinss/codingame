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
        String LON = in.next();
        String LAT = in.next();
        Double LON_D = (Double.parseDouble(LON.replace(',','.')));
        Double LAT_D = (Double.parseDouble(LAT.replace(',','.')));
        
        Double LON_D_rad = LON_D * Math.PI / 180;
        Double LAT_D_rad = LAT_D * Math.PI / 180;
        
        int col_index = 0;
        int col_name = 1;
        int col_addr = 2;
        int col_phone = 3;
        int col_lon = 4;
        int col_lat = 5;
        
        int N = in.nextInt();
        in.nextLine();
        String[][] list = new String[N][6];
        
        if (N < 10000 && N > 0){
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            //System.out.println(DEFIB);
            list[i] = DEFIB.split(";");
        }
        
        
        for(int i=0;i < N;i++){
            for(int j=0;j<6;j++){
                //System.out.println("list["+i+"]["+j+"]: "+ list[i][j]);
            }
        }
        //System.out.println(list[44][col_name]);
        //System.out.println(list[23][col_name]);
        
        
        HashMap<String, Double> dist = new HashMap<String, Double>();
        
        for (int i = 0; i< N; i++){
            Double x = 0.0;
            Double y = 0.0;
            Double d = 0.0;
            
            Double d_lon_d = Double.parseDouble(list[i][col_lon].replace(',','.'));
            Double d_lat_d = Double.parseDouble(list[i][col_lat].replace(',','.'));
            
            Double d_lon_d_rad = d_lon_d * Math.PI / 180;
            Double d_lat_d_rad = d_lat_d * Math.PI / 180;
            
            x = (( LON_D_rad - d_lon_d_rad )) * (Math.cos((LAT_D_rad + d_lat_d_rad)/2.0));
            //System.out.println("x:" + x);
            
            y = (LAT_D_rad - d_lat_d_rad);
            //System.out.println("y:" + y);
            
            d = Math.abs((Math.sqrt(x*x + y*y))*6371);
            //System.out.println("d:" + d);
            dist.put(list[i][col_name].toString(), d);
        }
        
        //System.out.println(dist.get(list[44][col_name].toString()));
        //System.out.println(dist.get(list[23][col_name].toString()));
        
        Double temp = 0.0;
        Double min = -1.0;
        String min_defib = "";
        for (String defib : dist.keySet()){
            if(min < 0){
                min = dist.get(defib);
                min_defib = defib;
            } else {
                temp = dist.get(defib);
                if (temp < min){
                    min = dist.get(defib);
                    min_defib = defib;
                }
            }
        }
        
        System.out.println(min_defib);
        }
        

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("answer");
    }
}