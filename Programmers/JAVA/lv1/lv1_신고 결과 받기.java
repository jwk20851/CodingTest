https://programmers.co.kr/learn/courses/30/lessons/92334

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, List<String>> user = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        
        for(String id : id_list){
            List<String> list = new LinkedList<>();
            user.put(id, list);
            count.put(id, 0);
        }
        
        for(String tmp : report){
            String[] arr = tmp.split(" ");
            String a_user = arr[0];
            String b_user = arr[1];           
            
            List<String> list = user.get(b_user);
            if(list.contains(a_user))
                continue;
            
            list.add(a_user);
            user.put(b_user, list);
        }
        
        for(String str : user.keySet()){
            List<String> list = user.get(str);          
            if(list.size() >= k){                
                for(String id : list){
                    int cnt = count.get(id)+1;
                    count.put(id, cnt);          
                }
            }
        }
        
        int[] answer = new int[id_list.length];
        int i = 0;
        for(String data : id_list){
            answer[i] = count.get(data);
            i++;
         }
        
        return answer;
    }
}