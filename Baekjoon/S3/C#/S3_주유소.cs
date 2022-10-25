https://www.acmicpc.net/problem/13305

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            long[] d = Array.ConvertAll(Console.ReadLine().Split(' '), long.Parse);
            long[] station = Array.ConvertAll(Console.ReadLine().Split(' '), long.Parse);

            long sum = 0;
            long tmp = station[0];
            for (int i = 0; i < station.Length - 1; i++)
            {
                if (tmp > station[i])
                    tmp = station[i];

                sum += d[i] * tmp;
            }

            Console.WriteLine(sum);
        }
    }
}