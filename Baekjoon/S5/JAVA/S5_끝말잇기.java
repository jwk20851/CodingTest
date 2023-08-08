//https://www.acmicpc.net/problem/28432

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 1){
            br.readLine();
            br.readLine();
            System.out.print(br.readLine());
            return;
        }
        
        List<String> li = new ArrayList<String>();
        int idx = 0;
        for(int i = 0; i < N; i++){
            String tmp = br.readLine();
            if(tmp.equals("?"))
                idx = i;
            li.add(tmp);
        }
        
        char firstC = ' ', lastC = ' ';
        int caseNum = 0;
        if(idx == 0){
            lastC = li.get(idx+1).charAt(0);
            caseNum = 1;
        }
        else if(idx == N-1){
            firstC = li.get(idx-1).charAt(li.get(idx-1).length()-1);
            caseNum = 2;
        }
        else{
            firstC = li.get(idx-1).charAt(li.get(idx-1).length()-1);
            lastC = li.get(idx+1).charAt(0);
            caseNum = 3;
        }
        
        int M = Integer.parseInt(br.readLine());
        String ans = "";
        for(int i = 0 ; i < M; i++){
            String tmp = br.readLine();
            if(li.contains(tmp))
                continue;
                
            switch(caseNum){
                case 1:
                    if(tmp.charAt(tmp.length()-1)==lastC)
                        ans = tmp;
                    break;
                case 2:
                    if(tmp.charAt(0)==firstC)
                        ans = tmp;
                    break;
                case 3:
                    if(tmp.charAt(0)==firstC && tmp.charAt(tmp.length()-1)==lastC)
                        ans = tmp;
                    break;
            }
            
            if(!ans.equals(""))
                break;
        }
        
        System.out.print(ans);
	}
}