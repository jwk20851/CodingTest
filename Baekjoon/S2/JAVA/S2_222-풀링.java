//https://www.acmicpc.net/problem/17829

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    private static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		arr =  new int[N][N];
		for(int i = 0; i < N; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < N; j++)
		        arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(poolingArr(0, 0, N));
	}
	
	private static int poolingArr(int x, int y, int n){
	    if(n != 2){
	        int[] tmp = new int[4];
	        n /= 2;
	        tmp[0] = poolingArr(x, y, n);
	        tmp[1] = poolingArr(x+n, y, n);
	        tmp[2] = poolingArr(x, y+n, n);
	        tmp[3] = poolingArr(x+n, y+n, n);
	        
	        Arrays.sort(tmp);
            return tmp[2];
	    }
	    else{
            int[] tmp = new int[4];
            int idx = 0;
            for(int i = x; i < x+2; i++){
                for(int j = y; j < y+2; j++){
                    tmp[idx++] = arr[i][j];
                }
            }
            
            Arrays.sort(tmp);
            return tmp[2];
	    }
    }
}