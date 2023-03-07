//https://www.acmicpc.net/problem/2851

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		for(int i = 0; i < 10; i++){
		    int mushroom = Integer.parseInt(br.readLine());
		    
		    if(Math.abs(100-sum) >= Math.abs(100-(sum+mushroom)))
		        sum += mushroom;
		    else
		        break;
		}
		
		System.out.print(sum);
	}
}