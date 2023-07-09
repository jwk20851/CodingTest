//https://www.acmicpc.net/problem/1713

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    private static int N, K;
    private static int[] stu;
    private static List<Info> li;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		stu = new int[101];
		li = new ArrayList<Info>();
		for(int i = 0; i < K; i++){
		    int tmp = Integer.parseInt(st.nextToken());
		    if(stu[tmp] == 0){          //추천이 0일 경우
		        if(li.size() >= N){     //사진틀이 다 찼을 경우     
		            Collections.sort(li, new Comparator<Info>(){    //조건에 따른 리스트 정렬
                        @Override
                        public int compare(Info o1, Info o2){
                            if(o1.cnt == o2.cnt)        //추천 수가 같을 경우
                                return o1.time-o2.time;     //시간 순으로 오름차순
                            else
                                return o1.cnt-o2.cnt;       //추천 순으로 오름차순
                        }
                    });
                    
                    int num = li.get(0).num;    //추천 수가 가장 낮고 오래된 번호
					stu[num] = 0;
					li.remove(0);
		        }
		        li.add(new Info(tmp, 1, i));
				stu[tmp] = 1;
		    }
		    else{
				for(int j = 0; j < li.size(); j++){
					if(li.get(j).num == tmp){       //걸려있는 사진과 번호가 일치할 경우
						li.get(j).cnt++;
						break;
					}
				}
		        stu[tmp]++;
		    }
		}
		
        for(int i = 0; i < 101; i++){
			if(stu[i] != 0)
				System.out.print(i + " ");
		}
    }
    
    static class Info{
        int num, cnt, time;
        
        public Info(int num, int cnt, int time){
            this.num = num;
            this.cnt = cnt;
            this.time = time;
        }
    }
}