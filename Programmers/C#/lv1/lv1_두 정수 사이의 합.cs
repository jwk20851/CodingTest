https://programmers.co.kr/learn/courses/30/lessons/12912?language=csharp

public class Solution
{
    public long solution(int a, int b)
    {
        long answer = 0;
        int min = (a < b) ? a : b;
        int max = (a < b) ? b : a;
        for (int i = min; i <= max; i++)
        {
            answer += i;
        }
        return answer;
    }
}