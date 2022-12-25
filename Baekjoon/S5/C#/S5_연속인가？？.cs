https://www.acmicpc.net/problem/26517

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int k = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int a = arr[0], b = arr[1], c = arr[2], d = arr[3];

            long s = a * k + b;
            long l = c * k + d;

            if (s == l)
                Console.WriteLine("Yes " + s);
            else
                Console.WriteLine("No");
        }
    }
}