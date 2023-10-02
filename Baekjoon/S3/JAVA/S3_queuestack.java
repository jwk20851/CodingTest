//https://www.acmicpc.net/problem/24511

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	StringTokenizer A = new StringTokenizer(br.readLine());
        StringTokenizer B = new StringTokenizer(br.readLine());
    	
    	LinkedList<Integer> qst = new LinkedList<>();
    	for(int i = 0; i < N; i++){
    	    int isSt = Integer.parseInt(A.nextToken());
    	    int num = Integer.parseInt(B.nextToken());
    	    if(isSt == 0)
    	        qst.add(num);
    	}
    	
    	int M = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < M; i++){
            qst.addFirst(Integer.parseInt(st.nextToken()));  //qst.add(0, val) 도 가능
    	    sb.append(qst.pollLast()+" ");
    	}
    	
    	System.out.print(sb);
    }
}