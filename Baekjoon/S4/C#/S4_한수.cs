https://www.acmicpc.net/problem/1065

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            int n = int.Parse(str);
            int cnt = 99;

            if (n < 100)
            {
                Console.WriteLine(n);
            }
            else
            {
                for (int i = 100; i <= n; i++)
                {
                    if (check(i)) cnt++;
                }
                Console.WriteLine(cnt);
            }
        }

        static bool check(int n)
        {
            string str = n.ToString();
            int[] num = new int[str.Length];
            num[0] = int.Parse(str[0].ToString());
            num[1] = int.Parse(str[1].ToString());
            num[2] = int.Parse(str[2].ToString());

            if ((num[0] - num[1]) == (num[1] - num[2]))
                return true;
            return false;
        }
    }
}