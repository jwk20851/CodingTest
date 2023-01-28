//https://www.acmicpc.net/problem/1021

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    static LinkedList<Integer> dq = new LinkedList<Integer>();
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= n; i++)
			dq.add(i);
			
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[m];
		for(int i = 0; i < m; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int i = 0; i < m; i++){
			if(check(arr[i])){
				while(arr[i] != dq.get(0)){
				    dq.addLast(dq.pollFirst());
				    cnt++;
				}
			}
			else{
				while(arr[i] != dq.get(0)){
				    dq.addFirst(dq.pollLast());
				    cnt++;
				}
			}
			dq.poll();
		}
		
		System.out.println(cnt);
	}
	
	static boolean check(int n){
		for(int i = 0; i <= dq.size()/2; i++){
			if(n == dq.get(i))
				return true;
		}
		return false;
	}
}