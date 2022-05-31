https://programmers.co.kr/learn/courses/30/lessons/68644

using System;
using System.Collections.Generic;

public class Solution
{
    public int[] solution(int[] numbers)
    {
        List<int> answer = new List<int>();

        int sum = 0;
        for (int i = 0; i < numbers.Length; i++)
        {
            for (int j = i + 1; j < numbers.Length; j++)
            {
                sum = numbers[i] + numbers[j];
                if (!(answer.Contains(sum)))
                    answer.Add(sum);
            }
        }
        answer.Sort();

        return answer.ToArray();
    }
}