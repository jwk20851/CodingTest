https://school.programmers.co.kr/learn/courses/30/lessons/76501?language=csharp

using System;

public class Solution
{
    public int solution(int[] absolutes, bool[] signs)
    {
        int answer = 0;

        for (int i = 0; i < signs.Length; i++)
        {
            answer = (signs[i]) ? answer + absolutes[i] : answer - absolutes[i];
        }

        return answer;
    }
}