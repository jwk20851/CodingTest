https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=csharp

using System;
using System.Collections.Generic;

public class Solution
{
    public int[] solution(int[] array, int[,] commands)
    {
        List<int> answer = new List<int>();
        List<int> temp = new List<int>();

        for (int i = 0; i < commands.GetLength(0); i++)
        {
            for (int j = commands[i, 0] - 1; j < commands[i, 1]; j++)
            {
                temp.Add(array[j]);
            }

            temp.Sort();
            answer.Add(temp[commands[i, 2] - 1]);
            temp.Clear();
        }

        return answer.ToArray();
    }
}