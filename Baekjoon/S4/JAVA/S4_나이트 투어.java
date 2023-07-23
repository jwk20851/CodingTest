//https://www.acmicpc.net/problem/1331

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dx[] = new int[]{1,1,2,2,-1,-1,-2,-2};
    	int dy[] = new int[]{2,-2,1,-1,2,-2,1,-1};
    	boolean visited[][] = new boolean[6][6];
	    
		String coor = br.readLine();
		int sR = coor.charAt(0) - 'A';
		int sC = coor.charAt(1) - '1';
		visited[sR][sC] = true;
		
		int preR = sR, preC = sC;
		boolean tmp = false;
		for(int i = 0; i < 35; i++){
	        coor = br.readLine();
		    int nowR = coor.charAt(0) - 'A';
			int nowC = coor.charAt(1) - '1';
            
            tmp = false;
            for(int k = 0; k < 8; k++){
				int nr = dx[k] +preR;
				int nc = dy[k] +preC;
				
				if(nr<0 || nc<0 || nr>=6 || nc>=6)
				    continue;
				
				if(nr == nowR && nc == nowC){
				    if(!visited[nowR][nowC]){
				        visited[nowR][nowC] = true;
                        tmp = true;
                        break;
                    }
				}
			}
			
			if(tmp){
	            preR = nowR;
	            preC = nowC;
			}
			else{
				System.out.println("Invalid");
				System.exit(0);
			}
		}
		
		boolean check = false;
		for(int k = 0; k < 8; k++){
			int nr = preR +dx[k];
			int nc = preC +dy[k];
			
			if(nr == sR && nc == sC){
	            check = true;
	            break;
			}
		}
		
		System.out.print(check? "Valid":"Invalid");
	}
}