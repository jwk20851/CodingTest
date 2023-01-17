//https://www.acmicpc.net/problem/2822

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 8;
		int[][] arr = new int[cnt][2];
		
		for(int i = 0; i < cnt; i++){
		    arr[i][0] = Integer.parseInt(br.readLine());
		    arr[i][1] = i+1;
		}
		
		Arrays.sort(arr, new Comparator<int[]>(){
		   public int compare(int[] a, int[] b){
		       return b[0] - a[0];
		   }
		});
		
		int sum = 0;
		int[] tmp = new int[5];
		for(int i = 0; i < 5; i++){
		    sum += arr[i][0];
		    tmp[i] = arr[i][1];
		}
		
		Arrays.sort(tmp);
		
		System.out.println(sum);
		for(int i = 0; i < 5; i++)
			System.out.print(tmp[i] + " ");
	}
}