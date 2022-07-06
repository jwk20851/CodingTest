https://school.programmers.co.kr/learn/courses/30/lessons/82612?language=csharp

class Solution
{
    public long solution(int price, int money, int count)
    {
        long sum = 0;

        while (count > 0)
        {
            sum += price * (count--);
        }

        return (sum > money) ? sum - money : 0;
    }
}