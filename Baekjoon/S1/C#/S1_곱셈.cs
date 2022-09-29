https://www.acmicpc.net/problem/1629

using System;

namespace Beakjoon
{
    class Program
    {
        static long a, b, c, tmp;
        static void Main(string[] args)
        {
            long[] abc = Array.ConvertAll(Console.ReadLine().Split(' '), long.Parse);
            a = abc[0];
            b = abc[1];
            c = abc[2];

            if (b == 1)
            {
                Console.Write(a % c);
                return;
            }

            Console.Write(func(a, b) % c);
        }

        static long func(long n, long m)
        {
            if (m == 1)
                return n;

            tmp = func(n, m / 2);

            if (m % 2 == 0)
                return tmp * tmp % c;

            return (tmp * tmp % c) * n % c;
        }
    }
}