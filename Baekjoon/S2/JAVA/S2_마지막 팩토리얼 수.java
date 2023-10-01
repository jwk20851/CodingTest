//https://www.acmicpc.net/problem/2553

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        long fact = 1;
        for(int i = 1; i <= N; i++){
			fact *= i;
			fact %= 1000000000;
			while(fact%10 == 0)
			     fact /= 10;
		}
        
        System.out.println(fact%10);
    }
}