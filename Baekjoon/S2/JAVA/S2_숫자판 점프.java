//https://www.acmicpc.net/problem/2210

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
    private static String[][] map;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static List<String> li = new ArrayList<String>();
    private static String str = "";
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = 5;
		map = new String[n][n];
		for(int i = 0; i < n; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < n; j++)
		        map[i][j] = st.nextToken();
		}
		
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        str = map[i][j];
		        DFS(i, j, 0);
		    }
		}
		
		System.out.println(li.size());
	}
	
	private static void DFS(int x, int y, int depth){
	    if(depth == 5){
	        if(!li.contains(str))
	            li.add(str);
	        return;
	    }
	    
	    for(int i = 0; i < 4; i++){
	        int nx = x + dx[i];
	        int ny = y + dy[i];
	        
	        if(nx < 0 || ny < 0 || nx >= 5 || ny >= 5)
	            continue;
	            
	        str += map[nx][ny];
	        DFS(nx, ny, depth+1);
	        str = str.substring(0, str.length()-1);
	    }
	}
}
