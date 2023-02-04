//https://www.acmicpc.net/problem/1337

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i < n; i++)
          li.add(Integer.parseInt(br.readLine()));
        
        Collections.sort(li);

        int[] cnt = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                if (!li.contains(li.get(i) + j))
                    cnt[i]++;
            }
        }

        int min = cnt[0];
        for (int c : cnt) {
            if (c <= min)
                min = c;
        }
        
        System.out.println(min);
	}
}