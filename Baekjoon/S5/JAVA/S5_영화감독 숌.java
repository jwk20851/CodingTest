//https://www.acmicpc.net/problem/1436

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 666;
        int cnt = 1;
        
        while(cnt != n){
            num++;
            
            if(Integer.toString(num).contains("666"))
                cnt++;
        }
        
        System.out.print(num);
    }
}