//https://www.acmicpc.net/problem/9742

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int cnt, num;
    private static char[] cArr;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp;
		while((tmp = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(tmp);
            String str = st.nextToken();
            num = Integer.parseInt(st.nextToken());
            
            cnt = 0;
            cArr = new char[str.length()];
            visited = new boolean[str.length()];
            
            DFS(str, 0);
            
            if(cnt < num)
                sb.append(str+" "+num+" = No permutation\n");
		}
            
        System.out.print(sb);
    }
    
    private static void DFS(String str, int depth){
        if(depth == str.length()){
            cnt++;
            if(cnt == num)
                sb.append(str+" "+num+" = "+new String(cArr)+"\n");
            
            return;
        }
        
        for(int i = 0; i < str.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                cArr[depth] = str.charAt(i);
                DFS(str, depth+1);
                visited[i] = false;
            }
        }
    }
}