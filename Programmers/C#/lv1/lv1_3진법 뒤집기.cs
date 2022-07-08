https://school.programmers.co.kr/learn/courses/30/lessons/68935?language=csharp

using System;

public class Solution
{
    public int solution(int n)
    {
        int answer = 0;
        while (n > 0)
        {
            answer *= 3;
            answer += n % 3;
            n /= 3;
        }
        return answer;
    }
}