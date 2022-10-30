//https://www.acmicpc.net/problem/17478

import java.io.*;
import java.util.*;

public class Main{
    static StringBuilder sb = new StringBuilder();
    static int n;
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        sb.append("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
        recur(0);
        
        System.out.print(sb);
        br.close();
    }
    
    static void recur(int cnt){
        String str = "____".repeat(cnt);
        sb.append(str);
        sb.append("\"����Լ��� ������?\"\n");
        if(cnt < n){
            sb.append(str);
            sb.append("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
            sb.append(str);
            sb.append("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
            sb.append(str);
            sb.append("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
            recur(cnt+1);
        }
        else{
            sb.append(str);
            sb.append("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
        }
        sb.append(str);
        sb.append("��� �亯�Ͽ���.\n");
    }
}