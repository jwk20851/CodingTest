https://programmers.co.kr/learn/courses/30/lessons/12928?language=csharp

public class Solution
{
    public int solution(int n)
    {
        int answer = 0;

        if (n == 0) return 0;

        int sum = 0, ctr = 1;
        while (ctr != n)
        {
            if (n % ctr == 0)
                sum += ctr;
            ctr++;
        }
        answer = sum + n;

        return answer;
    }
}