//https://www.acmicpc.net/problem/5568

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main{
    private static int N,K;
    private static int[] arr;
    private static boolean[] visited;
    private static Set<Integer> set = new HashSet<Integer>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        
        arr = new int[N];
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());
        
        visited = new boolean[N];
        DFS(K, "");
        
        System.out.print(set.size());
    }
    
    private static void DFS(int depth, String str){
        if(depth == 0){
            set.add(Integer.parseInt(str));
            return;
        }
        
        for(int i = 0; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                DFS(depth-1, str+arr[i]);
                visited[i] = false;
            }
        }
    }
}