https://school.programmers.co.kr/learn/courses/30/lessons/42840

using System;
using System.Collections.Generic;
using System.Linq;

public class Solution
{
    public int[] solution(int[] answers)
    {
        int[][] students = new int[3][];
        students[0] = new int[] { 1, 2, 3, 4, 5 };
        students[1] = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
        students[2] = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] score = new int[3] { 0, 0, 0 };

        for (int i = 0; i < answers.Length; i++)
        {
            for (int j = 0; j < score.Length; j++)
            {
                if (students[j][i % students[j].Length] == answers[i])
                    score[j]++;
            }
        }

        List<int> answer = new List<int>();
        for (int i = 0; i < score.Length; i++)
        {
            if (score[i] == score.Max())
                answer.Add(i + 1);
        }

        return answer.ToArray();
    }
}