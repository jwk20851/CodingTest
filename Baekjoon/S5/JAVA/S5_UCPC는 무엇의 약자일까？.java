https://www.acmicpc.net/submit/15904

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] UCPC = {'U', 'C', 'P', 'C'};
        int idx = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(UCPC[idx] == str.charAt(i))
                idx++;
            if(idx == 4){
                break;
            }
        }
        
        if(idx==4)
            System.out.println("I love UCPC");
        else
            System.out.println("I hate UCPC");
    }
}