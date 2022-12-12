https://www.acmicpc.net/problem/1072

using System;

namespace Baekjoon
{
    class Program
    {
        static long x, y, z;
        static void Main(string[] args)
        {
            long[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), long.Parse);
            x = arr[0];
            y = arr[1];
            z = y * 100 / x;

            if (z >= 99)
                Console.WriteLine(-1);
            else
                Console.WriteLine(func(1, x));
        }

        static long func(long l, long r)
        {
            while (l <= r)
            {
                long mid = (l + r) / 2;

                if ((long)((y + mid) * 100 / (x + mid)) == z)
                    l = mid + 1;
                else
                    r = mid - 1;
            }

            return l;
        }
    }
}