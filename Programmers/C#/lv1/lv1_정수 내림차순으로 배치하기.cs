using System;

public class Solution
{
    public long solution(long n)
    {
        long answer = 0;

        String str = n.ToString();
        Char[] temp = str.ToCharArray();

        Array.Sort(temp);
        Array.Reverse(temp);

        answer = long.Parse(temp);

        return answer;
    }
}