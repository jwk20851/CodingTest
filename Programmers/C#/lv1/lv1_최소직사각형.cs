https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=csharp

using System;

public class Solution
{
    public int solution(int[,] sizes)
    {
        int answer = 0;

        int w = 0, h = 0;
        for (int i = 0; i < sizes.GetLength(0); i++)
        {
            w = Math.Max(w, Math.Min(sizes[i, 0], sizes[i, 1]));
            h = Math.Max(h, Math.Max(sizes[i, 0], sizes[i, 1]));
        }
        answer = w * h;

        return answer;
    }
}