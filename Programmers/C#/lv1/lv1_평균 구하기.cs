https://programmers.co.kr/learn/courses/30/lessons/12944?language=csharp

public class Solution
{
    public double solution(int[] arr)
    {
        double answer = 0;

        int sum = 0;
        foreach (int n in arr)
        {
            sum += n;
        }
        answer = (double)sum / arr.Length;

        return answer;
    }
}