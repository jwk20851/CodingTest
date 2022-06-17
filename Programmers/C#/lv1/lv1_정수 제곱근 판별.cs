using System;

public class Solution
{
    public long solution(long n)
    {
        long answer = 0;

        long tmp = (long)Math.Sqrt(n);
        answer = (tmp * tmp == n) ? (tmp + 1) * (tmp + 1) : -1;

        return answer;
    }
}