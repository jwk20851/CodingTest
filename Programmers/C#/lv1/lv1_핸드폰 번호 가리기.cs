https://programmers.co.kr/learn/courses/30/lessons/12948?language=csharp

public class Solution
{
    public string solution(string phone_number)
    {
        string answer = "";

        for (int i = 0; i < phone_number.Length; i++)
        {
            if (i < phone_number.Length - 4)
            {
                answer += "*";
            }
            else
            {
                answer += phone_number[i];
            }
        }
        // 높은 버전에서 string[^4..]: ^ 역순, 4.. 4까지 자르기
        return answer;
    }
}