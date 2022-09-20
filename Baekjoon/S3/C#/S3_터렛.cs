https://www.acmicpc.net/problem/1002

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            while (n-- > 0)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int x1 = arr[0];
                int y1 = arr[1];
                int r1 = arr[2];
                int x2 = arr[3];
                int y2 = arr[4];
                int r2 = arr[5];

                double d = Math.Sqrt(Math.Pow(x2 - x1, 2) + Math.Pow(y2 - y1, 2));

                if (d == 0 && r1 == r2)
                    Console.WriteLine(-1);

                else if (r1 + r2 < d || Math.Abs(r2 - r1) > d || d == 0)
                    Console.WriteLine(0);

                else if (r1 + r2 == d || Math.Abs(r2 - r1) == d)
                    Console.WriteLine(1);

                else if (r1 + r2 > d || Math.Abs(r2 - r1) < d)
                    Console.WriteLine(2);
            }
        }
    }
}