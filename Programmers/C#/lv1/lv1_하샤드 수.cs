https://programmers.co.kr/learn/courses/30/lessons/12947?language=csharp

public class Solution
{
    public bool solution(int x)
    {
        bool answer = true;

        string temp = x.ToString();
        int sum = 0;

        foreach (char c in temp)
        {
            sum += int.Parse(c.ToString());
        }

        answer = (x % sum == 0) ? true : false;

        return answer;
    }
}