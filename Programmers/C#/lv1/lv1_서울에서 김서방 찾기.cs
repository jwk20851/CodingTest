https://programmers.co.kr/learn/courses/30/lessons/12919?language=csharp

using System;

public class Solution {
    public string solution(string[] seoul) {
        return String.Format("김서방은 {0}에 있다", Array.FindIndex(seoul, i => i == "Kim"));
    }
}