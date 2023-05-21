//https://www.acmicpc.net/problem/14729

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[100001];
		while(N-- > 0){
		    double tmp = Double.parseDouble(br.readLine());
		    arr[(int)(tmp*1000)]++;
		}
		
		for(int i = 0; i < 7; i++){
		    for(int j = 0; j < 100001; j++){
                if(arr[j]-- > 0){
                    System.out.printf("%.3f\n", j/1000.0);
                    break;
                }
		    }
		}
	}
}