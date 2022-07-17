https://school.programmers.co.kr/learn/courses/30/lessons/12977?language=csharp

using System;

class Solution
{
    public int solution(int[] nums)
    {
        int answer = 0;
        int sum = 0;
        bool sosu = true;
        for (int i = 0; i < nums.Length; i++)
        {
            for (int j = i + 1; j < nums.Length; j++)
            {
                for (int k = j + 1; k < nums.Length; k++)
                {
                    sum = nums[i] + nums[j] + nums[k];
                    sosu = true;
                    for (int l = 2; l <= (int)Math.Sqrt(sum); l++)
                    {
                        if (sum % l == 0)
                        {
                            sosu = false;
                            break;
                        }
                    }
                    if (sosu)
                        answer++;
                }
            }
        }

        return answer;
    }
}