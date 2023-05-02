//https://www.acmicpc.net/problem/4659

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        String str = "";
        while(true){
            str = br.readLine();
            if(str.equals("end"))
                break;
                
            sb.append("<").append(str).append("> is ");
            if(!check(str))
                sb.append("not ");
            
            sb.append("acceptable.").append("\n");
        }
        
        System.out.print(sb);
	}
	
	static boolean check(String str){
        char[] vowel = {'a','e','i','o','u'};
        List<Character> li = new ArrayList<Character>();
        for(int i = 0; i < str.length(); i++)
            li.add(str.charAt(i));
        
        if(!(li.contains('a') || li.contains('e') || li.contains('i') || li.contains('o') || li.contains('u')))
            return false;
        
        for(int i = 2; i < str.length(); i++){
            if(isVowel(str.charAt(i))){
                if(isVowel(str.charAt(i-1)) && isVowel(str.charAt(i-2)))
                    return false;
            }
            else{
                if(!isVowel(str.charAt(i-1)) && !isVowel(str.charAt(i-2)))
                    return false;
            }
        }
        
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                if(str.charAt(i) != 'e' && str.charAt(i) != 'o'){
                    return false;
                } 
            }
        }
        
        return true;
    }
    
    static boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}