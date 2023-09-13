//https://www.acmicpc.net/problem/3613

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if(str.charAt(0)<='_' || str.charAt(str.length() - 1)=='_'){    //'A~Z': 65~90, '_': 95, 'a~z': 97~122
            System.out.println("Error!");
            return;
        }
		
		boolean hasUpper = false;
        boolean isJava = true;
        char pre = str.charAt(0);
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '_'){
                if(hasUpper || pre == '_'){
                    System.out.println("Error!");
                    return;
                }
                isJava = false;
            }
            if(c <= 'Z'){
                if(!isJava){
                    System.out.println("Error!");
                    return;
                } 
                hasUpper = true;
            }
            
            pre = c;
        }
        
        StringBuilder sb = new StringBuilder();
        if(isJava){
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                sb.append((c <= 'Z')? "_"+String.valueOf(c).toLowerCase() : c);
            }
        }
        else{
            boolean nextUpper = false;
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(nextUpper){
                    sb.append(String.valueOf(c).toUpperCase());
                    nextUpper = false;
                }
                else{
                    if(str.charAt(i) == '_')
                        nextUpper = true;
                    else
                        sb.append(c);
                }
            }
        }

        System.out.print(sb);
    }
}