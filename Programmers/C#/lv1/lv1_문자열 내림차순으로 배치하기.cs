https://programmers.co.kr/learn/courses/30/lessons/12917?language=csharp

using System;

public class Solution
{
    public string solution(string s)
    {
        string answer = "";

        char[] temp = s.ToCharArray();
        Array.Sort(temp);
        Array.Reverse(temp);
        answer = new string(temp);

        return answer;
    }
}