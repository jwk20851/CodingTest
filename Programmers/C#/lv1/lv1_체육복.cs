https://school.programmers.co.kr/learn/courses/30/lessons/42862?language=csharp

using System;
using System.Collections.Generic;

public class Solution
{
    public int solution(int n, int[] lost, int[] reserve)
    {
        int answer = 0;

        List<int> LostList = new List<int>(lost);
        List<int> ReserveList = new List<int>(reserve);
        List<int> RemoveList = new List<int>();

        foreach (var val1 in LostList)
        {
            foreach (var val2 in ReserveList)
            {
                if (val1 == val2)
                {
                    RemoveList.Add(val1);
                    break;
                }
            }
        }

        foreach (var val in RemoveList)
        {
            LostList.Remove(val);
            ReserveList.Remove(val);
        }

        int Add = 0, Sub = 0;
        for (int i = 0; i < LostList.Count; i++)
        {
            Add = LostList[i] + 1;
            Sub = LostList[i] - 1;

            foreach (var val in ReserveList)
            {
                if (val == Add || val == Sub)
                {
                    ReserveList.Remove(val);
                    answer++;
                    break;
                }
            }
        }

        answer = n - (LostList.Count - answer);

        return answer;
    }
}