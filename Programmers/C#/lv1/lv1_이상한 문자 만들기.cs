https://programmers.co.kr/learn/courses/30/lessons/12930?language=csharp

public class Solution
{
    public string solution(string s)
    {
        string answer = "";

        int ctr = 0;
        foreach (char c in s)
        {
            answer += (ctr % 2 == 0) ? c.ToString().ToUpper() : c.ToString().ToLower();
            ctr = (c.Equals(' ')) ? 0 : ctr + 1;
        }

        return answer;
    }
}