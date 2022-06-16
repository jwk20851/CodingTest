https://programmers.co.kr/learn/courses/30/lessons/12937?language=csharp

public class Solution
{
    public string solution(int num)
    {
        string answer = "";
        answer = (num % 2 == 0) ? "Even" : "Odd";
        return answer;
    }
}