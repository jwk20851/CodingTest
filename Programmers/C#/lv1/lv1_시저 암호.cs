https://programmers.co.kr/learn/courses/30/lessons/12926?language=csharp

public class Solution
{
    public string solution(string s, int n)
    {
        string answer = "";

        char[] arr = s.ToCharArray();
        for (int i = 0; i < s.Length; i++)
        {
            int m = arr[i];
            if (m >= 'a' && m <= 'z')
                answer += (char)('a' + (m - 'a' + n) % 26);
            else if (m >= 'A' && m <= 'Z')
                answer += (char)('A' + (m - 'A' + n) % 26);
            else
                answer += ' ';
        }

        return answer;
    }
}