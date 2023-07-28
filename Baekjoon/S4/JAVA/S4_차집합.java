//https://www.acmicpc.net/problem/1822

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> set = new TreeSet<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < A; i++)
            set.add(Integer.parseInt(st.nextToken()));
            
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < B; i++)
            set.remove(Integer.parseInt(st.nextToken()));
        
        StringBuilder sb = new StringBuilder();
        sb.append(set.size()+"\n");
        for(Integer i : set)
            sb.append(i +" ");

        System.out.print(sb);
    }
}