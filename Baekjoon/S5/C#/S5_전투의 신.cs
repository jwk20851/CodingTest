//https://www.acmicpc.net/problem/26595

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int a = arr[0], pa = arr[1], b = arr[2], pb = arr[3];

            long cntA = 0, cntB = 0, sum = 0, max = 0;
            long ansA = 0, ansB = 0;

            for (int i = n; i >= 0; i--)
            {
                cntA = i / pa;
                cntB = (n - i) / pb;
                sum = a * cntA + b * cntB;

                if (sum > max)
                {
                    max = sum;
                    ansA = cntA;
                    ansB = cntB;
                }
            }

            Console.WriteLine(ansA + " " + ansB);
        }
    }
}