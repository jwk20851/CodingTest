//https://www.acmicpc.net/problem/2529

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    private static int k;
    private static char[] arr;
    private static boolean[] visited = new boolean[10];
    private static List<String> ans = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		k = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new char[k];
        for(int i = 0; i < k; i++)
            arr[i] = st.nextToken().charAt(0);
		
        DFS("", 0);
		Collections.sort(ans);
		
        System.out.println(ans.get(ans.size() - 1));
        System.out.println(ans.get(0));
	}
	
	private static void DFS(String num, int depth){
        if(depth == k+1){
            ans.add(num);
            return;
        }
        
        for(int i = 0; i <= 9; i++){
            if(visited[i])
				continue;
				
			if(depth == 0 || check(num.charAt(num.length()-1) - '0', i, arr[depth - 1])){
				visited[i] = true;
				DFS(num+i, depth+1);
				visited[i] = false;
			}
        }
    }
    
    static boolean check(int a, int b, char c){
		if(c == '<')
			return a < b;
		else
			return a > b;
	}
}