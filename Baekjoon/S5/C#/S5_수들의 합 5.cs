https://www.acmicpc.net/problem/2018

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int a = 1, b = 1, sum = 1, cnt = 0;
            while (a <= b)
            {
                if (sum == n) cnt++;

                if (sum < n)
                    sum += ++b;
                else
                    sum -= a++;
            }

            Console.Write(cnt);
        }
    }
}