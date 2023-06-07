//https://www.acmicpc.net/problem/18110

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] lv = new int[n];
        for(int i = 0; i < n; i++)
            lv[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(lv);
        
        int sum = 0;
        int aver = roundNum((double)(n*15/100.0));
        for(int i = aver; i < n-aver; i++)
            sum += lv[i];
            
        int total = n-aver*2;
        
        int ans = roundNum(sum/(total*1.0));
        System.out.println(ans);
    }
    
    private static int roundNum(double e){
        double tmp = Math.round(e*100/100);
        return (int)tmp;
    }
}