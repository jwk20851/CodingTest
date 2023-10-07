//https://www.acmicpc.net/problem/15702

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] score = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		    score[i] = Integer.parseInt(st.nextToken());
        
        List<Info> li = new ArrayList<>();
		for(int i = 0; i < M; i++){
		    st = new StringTokenizer(br.readLine());
		    int num = Integer.parseInt(st.nextToken());
		    int sum = 0;
		    for(int j = 0; j < N; j++){
		        if(st.nextToken().charAt(0) == 'O')
		            sum += score[j];
		    }
		    
		    li.add(new Info(num, sum));
		}
		
		Collections.sort(li, new Comparator<Info>(){
            @Override
            public int compare(Info o1, Info o2){
                if(o2.sum == o1.sum)
                    return o1.num - o2.num;
                else
                    return o2.sum - o1.sum;
            }
        });
		
		System.out.print(li.get(0).num +" "+ li.get(0).sum);
    }
    
    static class Info{
        int num, sum;
        public Info(int n, int s){
            this.num = n;
            this.sum = s;
        }
    }
}