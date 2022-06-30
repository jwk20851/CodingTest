https://programmers.co.kr/learn/courses/30/lessons/12918?language=csharp

public class Solution
{
    public bool solution(string s)
    {
        bool answer = true;
        int n = 0;
        answer = (!(s.Length == 4 || s.Length == 6)) ? false : int.TryParse(s, out n) ? true : false;
        //TryParse() 기본 리턴 타입은 boolean 이지만 out으로 변환 가능
        return answer;
    }
}