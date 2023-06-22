//https://www.acmicpc.net/problem/14567

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int N;
    private static int[] preArr, ansArr;
    private static List<List<Integer>> li;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		li = new ArrayList<>();
		for(int i = 0; i <= N; i++)
		    li.add(new ArrayList<Integer>());
		
		preArr = new int[N+1];
		for(int i = 1; i <= M; i++){
		    st = new StringTokenizer(br.readLine());
		    int pre = Integer.parseInt(st.nextToken());
		    int post = Integer.parseInt(st.nextToken());
		    
		    li.get(pre).add(post);
		    preArr[post]++;
		}
		
		ansArr = new int[N+1];
		checkPreSub();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++)
            sb.append(ansArr[i]+" ");
        
        System.out.print(sb);
	}
	
	private static void checkPreSub(){
	    Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            if(preArr[i] == 0){
                q.offer(i);
                ansArr[i] = 1;
            }
        }
        
        while(!q.isEmpty()){
            int tmp = q.poll();
            for(int i : li.get(tmp)){
                preArr[i]--;
                if(preArr[i] == 0){
                    q.offer(i);
                    ansArr[i] = ansArr[tmp] +1;
                }
            }
        }
	}
}