//https://www.acmicpc.net/problem/28125

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Character> li = Arrays.asList(new Character[]{'@','[','!',';','^','0','7','\''});
        StringBuilder sb = new StringBuilder();
        while(N-- > 0){
            String str = br.readLine();
            int originLen = str.length();
            int changeLen = 0;
            
            String changeString = "";
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(li.contains(c)){
                    changeLen++;
                    if(c == '\''){
                        if(i >= 2 && str.charAt(i-2)=='\\'){
                            originLen -= 2;
                            c = 'w';
                        }
                        else if(i >= 1 && str.charAt(i-1)=='\\'){
                            originLen -= 1;
                            c = 'v';
                        }
                    }
                    else
                        c = changeChar(c); 
                }
                if(c != '\\')
                    changeString += c;
            }
            sb.append((changeLen > (originLen-1)/2)? "I don't understand\n" : changeString+"\n");
        }
        System.out.print(sb);
    }
    
    private static char changeChar(char c){
        switch(c){
            case '@':
                c = 'a';
                break;
            case '[':
                c = 'c';
                break;
            case '!':
                c = 'i';
                break;
            case ';':
                c = 'j';
                break;
            case '^':
                c = 'n';
                break;
            case '0':
                c = 'o';
                break;
            case '7':
                c = 't';
                break;
        }
        return c;
    }
}