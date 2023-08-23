//https://www.acmicpc.net/problem/4396

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
    private static int N;
    private static boolean flag = true;
    private static char[][] mineMap;
    private static char[][] resultMap;
    private static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    private static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		mineMap = new char[N][N];
		resultMap = new char[N][N];
		for(int i = 0; i < N; i++){
		    String str = br.readLine();
		    for(int j = 0; j < N; j++)
		        mineMap[i][j] = str.charAt(j);
		}
		
		for(int i = 0; i < N; i++){
		    String str = br.readLine();
		    for(int j = 0; j < N; j++)
		        searchMine(i,j,str);
		}
		
		if(!flag){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(mineMap[i][j] == '*')
                        resultMap[i][j] = '*';
                }
            }
        }
        
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++){
		    for(int j = 0; j < N; j++)
		        bw.write(resultMap[i][j]);
		    bw.write("\n");
		}
		
		bw.flush();
		bw.close();
    }
    
    private static void searchMine(int x, int y, String s){
        if(s.charAt(y) == 'x'){
            if(mineMap[x][y] == '*')
                flag = false;
            else{
                int cnt = 0;
                for(int i = 0; i < 8; i++){
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    
                    if(nx<0 || nx>=N || ny<0 || ny>=N)
                        continue;
                        
                    if(mineMap[nx][ny] == '*')
                        cnt++;
                }
                resultMap[x][y] = (char)(cnt + '0');
            }
        }
        else
            resultMap[x][y] = '.';
    }
}