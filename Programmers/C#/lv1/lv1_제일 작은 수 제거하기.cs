using System.Collections.Generic;

public class Solution
{
    public int[] solution(int[] arr)
    {
        int[] answer = new int[] { };

        if (arr.Length == 1)
        {
            answer = new int[] { -1 };
            return answer;
        }

        List<int> list = new List<int>();
        int min = arr[0];
        foreach (int i in arr)
        {
            list.Add(i);
            if (min >= i)
                min = i;
        }
        list.Remove(min);
        answer = list.ToArray();

        return answer;
    }
}