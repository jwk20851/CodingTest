https://www.acmicpc.net/problem/2004

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            long[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), long.Parse);
            long n = arr[0];
            long m = arr[1];

            //nCk = n!/(n-k)!k!
            long cntT = 0, cntF = 0;
            cntT = two(n) - two(n - m) - two(m);
            cntF = five(n) - five(n - m) - five(m);

            Console.WriteLine(Math.Min(cntT, cntF).ToString());
        }

        static long two(long num)
        {
            long tmp = 0;
            for (long i = 2; i <= num; i *= 2)
                tmp += num / i;

            return tmp;
        }

        static long five(long num)
        {
            long tmp = 0;
            for (long i = 5; i <= num; i *= 5)
                tmp += num / i;

            return tmp;
        }
    }
}