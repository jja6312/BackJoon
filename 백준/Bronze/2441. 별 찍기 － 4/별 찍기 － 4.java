import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;




public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n= Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                bw.write(" ");
            }
            for(int j=0; j<n-i; j++){
                bw.write("*");
            }
            bw.write("\n");
        }




        bw.flush();
        bw.close();
        br.close();
    }//main

}//Main