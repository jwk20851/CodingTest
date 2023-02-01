//https://www.acmicpc.net/problem/1652

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
		char[][] map = new char[n][n];
		for(int i = 0; i < n; i++){
		    String str = br.readLine();
		    for(int j = 0; j < n; j++){
		        map[i][j] = str.charAt(j);
		    }
		}
		
		int row = 0, col = 0;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        if(map[i][j] == '.'){
		            if(j+1 < n && map[i][j+1] == '.' ){
                        if(j+2 >= n || (j+2 < n && map[i][j+2] == 'X')) 
                            row++;
                    }
                    
                    if(i+1 < n && map[i+1][j] == '.'){
                        if(i+2 >= n || (i+2 < n && map[i+2][j] == 'X'))
                            col++;
                    }
		        }
		    }
		}
		
		System.out.print(row + " " + col);
	}
}