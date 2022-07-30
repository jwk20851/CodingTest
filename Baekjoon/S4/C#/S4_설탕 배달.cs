https://www.acmicpc.net/submit/2839

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int f = n / 5, t = 0;
            int left = n % 5;
            while (f >= 0)
            {
                if (left % 3 == 0)
                {
                    t = left / 3;
                    left %= 3;
                    break;
                }
                else
                {
                    left += 5;
                    f--;
                }
            }

            Console.WriteLine(left == 0 ? f + t : -1);
        }
    }
}