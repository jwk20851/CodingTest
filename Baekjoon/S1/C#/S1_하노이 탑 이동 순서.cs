https://www.acmicpc.net/problem/11729

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static StringBuilder sb = new StringBuilder();

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            sb.AppendLine($"{Math.Pow(2, n) - 1}");
            Hanoi(n, 1, 3);
            Console.Write(sb);
        }

        static void Hanoi(int n, int start, int end)
        {
            if (n == 0)
                return;

            Hanoi(n - 1, start, 6 - start - end);
            sb.AppendLine(start + " " + end);
            Hanoi(n - 1, 6 - start - end, end);
        }
    }
}