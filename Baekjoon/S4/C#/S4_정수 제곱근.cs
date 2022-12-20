https://www.acmicpc.net/problem/2417

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            double n = double.Parse(Console.ReadLine());
            double sqrt = Math.Sqrt(n);
            double tmp = Math.Ceiling(sqrt);

            while (true)
            {
                if (tmp * tmp >= n)
                    break;
                tmp++;
            }

            Console.WriteLine(tmp);
        }
    }
}