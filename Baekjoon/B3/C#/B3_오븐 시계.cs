https://www.acmicpc.net/submit/2525

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] str = Console.ReadLine().Split(' ');
            int h = int.Parse(str[0]);
            int m = int.Parse(str[1]) + int.Parse(Console.ReadLine());

            h = (h + m / 60) % 24;
            m = m % 60;

            Console.WriteLine($"{h} {m}");
        }
    }
}