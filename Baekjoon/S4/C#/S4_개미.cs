https://www.acmicpc.net/problem/10158

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int w = arr[0];
            int h = arr[1];

            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int p = arr[0];
            int q = arr[1];
            int t = int.Parse(Console.ReadLine());

            int x = w - Math.Abs(w - (p + t) % (2 * w));
            int y = h - Math.Abs(h - (q + t) % (2 * h));

            Console.Write(x + " " + y);
        }
    }
}