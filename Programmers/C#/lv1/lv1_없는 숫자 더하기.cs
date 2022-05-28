https://programmers.co.kr/learn/courses/30/lessons/86051

using System;

public class Solution
{
    public int solution(int[] numbers)
    {
        int answer = -1;
        int sum = 45;

        for (int i = 0; i < numbers.Length; i++)
        {
            sum -= numbers[i];
        }
        answer = sum;

        return answer;
    }
}