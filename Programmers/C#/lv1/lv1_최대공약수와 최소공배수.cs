https://programmers.co.kr/learn/courses/30/lessons/12940?language=csharp

public class Solution
{
    public int[] solution(int n, int m)
    {
        int[] answer = new int[2];
        int gcd = 0;

        if (m != 0)
            gcd = GCD(n, m);
        else
            gcd = n;

        answer[0] = gcd;
        answer[1] = n * m / gcd;

        return answer;
    }

    public int GCD(int n, int m)
    {
        return (n % m == 0) ? m : GCD(m, n % m);
    }
}