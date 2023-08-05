//https://www.acmicpc.net/problem/2447

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
    private static char[][] star;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        star = new char[N][N];
        
        makeStar(0, 0, N, false);
        
        StringBuilder sb = new StringBuilder();
        //sb에 한 행씩 넣어서 출력할 수도 있다
        for(int i = 0; i < N; i++)
            sb.append(star[i]).append("\n");
        
        System.out.print(sb);
        
        /*
        //bw 경우, 속도가 더 빠르고 메모리를 적게 사용한다
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++){
			bw.write(star[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		*/
	}
	
	private static void makeStar(int x, int y, int num, boolean check){
	    if(check){
	        for(int i = x; i < x+num; i++){
				for(int j = y; j < y+num; j++)
					star[i][j] = ' ';
			}
			return;
	    }
	    
	    if(num == 1){
			star[x][y] = '*';
			return;
		}
	    
	    int cnt = 0, div = num/3;
	    for(int i = x; i < x+num; i+=div){
	        for(int j = y; j < y+num; j+=div){
	            if(cnt == 4)
	                makeStar(i, j, div, true);
                else
                    makeStar(i, j, div, false);
                    
	            cnt++;
	        }
	    }
	}
}