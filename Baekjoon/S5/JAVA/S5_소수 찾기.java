//https://www.acmicpc.net/problem/1978

import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(arr[i]);
            
            if(check(num))
                cnt++;
        }
        
        System.out.println(cnt);
        br.close();
    }
    
    static boolean check(int n){
        if(n == 1)
            return false;
            
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }
        
        return true;
    }
}