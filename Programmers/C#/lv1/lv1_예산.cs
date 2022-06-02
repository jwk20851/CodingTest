https://programmers.co.kr/learn/courses/30/lessons/12982?language=csharp

using System;

public class Solution
{
    public int solution(int[] d, int budget)
    {
        int answer = 0;

        Array.Sort(d);
        foreach (int item in d)
        {
            if ((budget -= item) >= 0)
                answer++;
        }

        return answer;
    }
}