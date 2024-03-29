//https://www.acmicpc.net/problem/1748

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int sum = 0, cnt = 1, num = 10;
        for(int i = 1; i <= N; i++){
            if(i%num == 0){
                cnt++;
                num*=10;
            }
            sum += cnt;
        }
        
        System.out.print(sum);
    }
}