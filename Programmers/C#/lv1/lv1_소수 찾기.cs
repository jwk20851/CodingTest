https://programmers.co.kr/learn/courses/30/lessons/12921

using System;

public class Solution
{
    public int solution(int n)
    {
        int answer = 0;

        bool sosu = true;
        for (int i = 2; i <= n; i++)
        {
            sosu = true;
            for (int j = 2; j <= (int)Math.Sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    sosu = false;
                    break;
                }
            }
            if (sosu != false)
                answer++;
        }

        return answer;
    }
}