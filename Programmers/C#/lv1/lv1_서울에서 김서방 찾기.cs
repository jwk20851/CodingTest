https://programmers.co.kr/learn/courses/30/lessons/12919?language=csharp

using System;

public class Solution {
    public string solution(string[] seoul) {
        return String.Format("�輭���� {0}�� �ִ�", Array.FindIndex(seoul, i => i == "Kim"));
    }
}