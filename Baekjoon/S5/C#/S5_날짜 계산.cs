https://www.acmicpc.net/problem/1476

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int e = arr[0];
            int m = arr[1];
            int s = arr[2];

            int a = 0, b = 0, c = 0, year = 0;
            while (true)
            {
                if (e == a && m == b && s == c)
                    break;

                year++;
                a++;
                b++;
                c++;

                if (a == 16) a = 1;
                if (b == 29) b = 1;
                if (c == 20) c = 1;
            }

            Console.Write(year);
        }
    }
}