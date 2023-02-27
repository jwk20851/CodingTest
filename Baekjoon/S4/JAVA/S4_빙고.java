//https://www.acmicpc.net/problem/2578

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
    static int[][] map = new int[5][5];
    static int lineCnt = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                li.add(Integer.parseInt(st.nextToken()));
            }
        }
        
        int row = 0, col = 0, check = 0;
        loop:
        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                int tmp = li.indexOf(Integer.parseInt(st.nextToken()));
                row = tmp/5;
                col = tmp%5;
                
                map[row][col] = 1;
                check++;
                
                if(checkFunc())
                    break loop;
            }
        }
        
        System.out.print(check);
    }
    
    static boolean checkFunc(){
        int checkCnt;
        for(int i = 0; i < 5; i++){
            if(map[i][0] == 1){
                checkCnt = 0;
                
                for(int j = 0; j < 5; j++){
                    if(map[i][j] == 1){
                        checkCnt++;
                    }
                }
                
                if(checkCnt == 5)
                    lineCnt++;
            }
        }
        
        for(int i = 0; i < 5; i++){
            if(map[0][i] == 1){
                checkCnt = 0;
                
                for(int j = 0; j < 5; j++){
                    if(map[j][i] == 1){
                        checkCnt++;
                    }
                }
                
                if(checkCnt == 5)
                    lineCnt++;
            }
        }
        
        if(map[0][0] == 1){
            checkCnt = 0;
            
            for(int i = 0; i < 5; i++){
                if(map[i][i] == 1){
                    checkCnt++;
                }
            }
                
            if(checkCnt == 5)
                lineCnt++;
        }
        
        if(map[0][4] == 1){
            checkCnt = 0;
            
            for(int i = 0; i < 5; i++){
                if(map[i][4-i] == 1){
                    checkCnt++;
                }
            }
                
            if(checkCnt == 5)
                lineCnt++;
        }
        
        if(lineCnt >= 3)
            return true;
        else{
            lineCnt = 0;
            return false;
        }
    }
}