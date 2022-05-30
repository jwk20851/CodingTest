https://programmers.co.kr/learn/courses/30/lessons/12901?language=csharp

using System;

public class Solution
{
    public string solution(int a, int b)
    {
        string answer = "";

        DateTime date = new DateTime(2016, a, b);
        //Console.WriteLine(date);  // 5/24/2016 12:00:00 AM
        answer = date.DayOfWeek.ToString();
        //Console.WriteLine(answer);    // 	Tuesday
        answer = answer.Substring(0, 3).ToUpper();

        return answer;
    }
}