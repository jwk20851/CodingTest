//https://www.acmicpc.net/problem/10973

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    private static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		
		if(search()){
			for(int i = 0; i < N; i++)
				System.out.print(arr[i] + " ");
		}
		else
			System.out.print(-1);
	}
	
	public static boolean search(){
	    int a = arr.length -1;
		while(a>0 && arr[a]>=arr[a-1])
			a--;

		if(a <= 0)
			return false;

		int b = arr.length -1;
		while(arr[a-1] <= arr[b])
			b--;
		
		swap(a-1, b);
		
		b = arr.length -1;
		while(a < b){
		    swap(a, b);
			a++;
			b--;
		}
		
		return true;
	}
	
	public static void swap(int x, int y){
	    int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
}