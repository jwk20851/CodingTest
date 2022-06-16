https://programmers.co.kr/learn/courses/30/lessons/12943?language=csharp

public class Solution
{
    public int solution(int num)
    {
        int answer = -1;
        
        long n = num;
        int ctr = 0;
        if (n > 1)
        {
            while (ctr < 500)
            {
                if (n % 2 == 0)
                    n = n / 2;
                else
                    n = n * 3 + 1;

                ctr++;
                if (n == 1)
                {
                    answer = ctr;
                    break;
                }
            }
        }
        else
            return 0;

        return answer;
    }
}