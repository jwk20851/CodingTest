https://www.acmicpc.net/submit/2588

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());

            Console.WriteLine(a * (b % 10));
            Console.WriteLine(a * ((b % 100 - b % 10) / 10));
            Console.WriteLine(a * (b / 100));
            Console.WriteLine(a * b);
        }
    }
}